/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;
import static java.lang.System.out;
import static com.huseyinaydin.Print.Printer.show;
/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static String s = "Hüseyin";
    static{
        s += " Aydın";
        System.out.println("Hello World");
        out.println("Selam kardeş");
        show("Selamun aleyküm");
    }
    static{
        s += " AAA";
        System.out.println("Selam sana Anadolu");
    }
    static{
        s += " BBB";
        System.out.println("Bye static");
    }
    
    public Main(){
        System.out.println("Hazırlandı Main");
    }
    public static void main(String[] args) {
        System.out.println("aaa " + s);
        Abc.i = 5;
        Abc abc = new Abc();
        Abc.show();
    }
    
}
class Abc{
    public static int i = 0;
    public Abc(){
        i++;
    }
    public static void show(){
        System.out.println(i);
    }
}