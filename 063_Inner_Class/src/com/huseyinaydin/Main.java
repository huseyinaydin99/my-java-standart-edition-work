/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.HashMap;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A.B b = new A().new B();//member class
        X x = new X(){//anonimous class
            @Override
            public void show() {
                super.show();
                System.out.println("Merhaba");
            }
        };
        x.show();
        C.D d = new C.D();//nested class
        d.show();
        Y<String,Integer,O<String,HashMap<String,String>>>.G g = new Y<String,Integer,O<String,HashMap<String,String>>>().new G();
        g.show();
    }
    
}
class A{
    private int i;

    public A() {
        System.out.println("A hazırlandı");
    }
    class B{//member class
        
        public B(){
            System.out.println("B hazırlandı");
        }

        public void show() {
            System.out.println("Selam");
        }
    }
}
class X{
    public void show(){
        System.out.println("Selam");
    }
}
class C{
    private int i;

    public C() {
    }
    static class D{//nested class
        public void show(){
            System.out.println("D Selam");
        }
    }
}
class Y<String,Integer,O>{
    class G{
        public void show(){
            System.out.println("Merhabalar");
        }
    }
}
class O<String,Map>{
    
}