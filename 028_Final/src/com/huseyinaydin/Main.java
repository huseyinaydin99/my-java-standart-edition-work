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
    final static double PI = Math.PI;
    public static void main(String[] args) {
        //PI = 10; //final demek sabit demektir. final olarak tanımlanan sabitlerin değeri değiştirilemez
        final String isim = "Hüseyin";
        //isim = "Hüseyin";
    }
    
}
final class A extends Object{

    public A() {
        super();
    }
    
    final public void show(){
        System.out.println("Selam");
    }
}
/*class B extends A{ //bir sınıf final olarak tanımlandı ise miras alınamaz
    /*public void show(){ //yukarıdaki show metodu final olarak tanımlandığı için miras alınamaz çünkü o final olmuştur
        
    }*/
//}
