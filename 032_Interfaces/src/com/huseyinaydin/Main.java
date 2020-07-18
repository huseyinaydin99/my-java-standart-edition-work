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
        A a = new B();
        a.show();
        
        A a1 = new A() {
            @Override
            public void show() {
                System.out.println("Show");
            }
        };
        a1.show();
        a1.drive();
        
        Abc<String,String,Integer> abc = new Abc<String, String, Integer>() {
            @Override
            public void abc(String t) {
                System.out.println(t);
            }
        };
        abc.abc("Merhaba");
        Abc<String,String,Integer> abc1 = (String s)->{
            System.out.println(s);
        };
        abc1.abc("Hi.!");
        C c = new C();
        c.show();
        A.display();
        
        B b = new B();
        if(b instanceof A){
            b.show();
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    
}
//marker interface -> birden fazla metot olursa
//functional interface -> tek metot olursa
@FunctionalInterface
interface A{
    public void show();
    static void display(){
        System.out.println("Hello!");
    }
    default void drive(){
        display();
    }
}
interface T{
    default void show(){
        System.out.println("Hello!");
    }
}
interface X{
    public void xxx();
}
interface Y extends A,X{
    
}
interface Abc<T,String,Integer>{
    public void abc(T t);
}
class B implements A{

    @Override
    public void show() {
        System.out.println("Selam");
    }
    
    public void display(){
        System.out.println("Merhaba");
    } 
}
class C extends B implements T{

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
    }
}
