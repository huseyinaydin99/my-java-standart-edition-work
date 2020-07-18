/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container<Number> container = new Container<>(new Integer(10));
        container.show();
        ArrayList<MyNumber> arrayList = new ArrayList<>();
        ArrayList<A> arrayList2 = new ArrayList<>();
        arrayList2.add(new B());
        container.demo(arrayList);
        container.demo2(arrayList2);
        
        X<O<String>> x = new X<O<String>>();
        x.hi(new Y());
    }
    
}
class A{
    
}
class B extends A{
    public String msg;

    public B() {
        this.msg = "Selam";
    }
    
}
class MyNumber extends Number{

    @Override
    public int intValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Container<T extends Number>{
    public T t;
    public B b;

    public Container(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public void show(){
        System.out.println(t.getClass().getName());
    }
    public void demo(ArrayList<? extends T> arrayList){
        System.out.println(arrayList);
        for (Object object : arrayList) {
            System.out.println(object);
        }
    }
    public void demo2(ArrayList<? super B> arrayList){//B'nin extend ettiği gelir yani B'nin süper sınıfı
        for (Object object : arrayList) {
            B b = (B)object;
            System.out.println(b.msg);
        }
    }
}
class O<T>{
    private T t;
    public void show(){
        System.out.println("Merhabalar");
        
    }
}
class X<B extends O<String>>{
    private B y;
    private Y y1;
    public void hi(B b){
        String s = b.getClass().getClass().getName();
        System.out.println(s);
        b.show();
    }
}
class Y<T> extends O{

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Selamlar");
    }
    
}