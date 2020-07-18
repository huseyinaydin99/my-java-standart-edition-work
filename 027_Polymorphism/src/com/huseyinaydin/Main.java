/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*B b = new B();
        b.show("Merhaba");*/
        A a = new B();
        a.show("Selam"); //b'deki metot çalıştı
        B b = new B();
        b.write();
    }
    
}
class A extends Object{
    int i = 5;
    public A() {
        super();
        System.out.println("A hazırlandı");
    }
    
    public void show(){ //overloading(aşırı yükleme)
        System.out.println("Merhaba kardeş");
    }
    
    public void show(String text){ //overloading(aşırı yükleme)
        System.out.println(text);
    }
    
    public void show(char[] textArray){ //overloading(aşırı yükleme)
        for (char c : textArray) {
            System.out.print(c);
        }
    }
}
class B extends A{
    int i = 3;
    public B() {
        super();
    }

    @Override
    public void show(String text) { //override(ezme metot)
        super.show(text);
        System.out.println("Nasılsın?");
    }
    
    public void write(){
        System.out.println(this.i);
        System.out.println(super.i);
    }
    
}
