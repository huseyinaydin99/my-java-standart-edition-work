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
        MyPrinter myPrinter = new MyPrinter();
        myPrinter.print("Hüseyin", StringParser::convert);//burada convert metodunu parametre olarak gönderdik. yani metodu referans aldık
    }
    
}
@FunctionalInterface
interface Parser{
    public String parse(String s);
}
class StringParser{
    public static String convert(String s){
        if(s.length()<=3)
            s = s.toUpperCase();
        else
            s = s.toLowerCase();
        return s;
    }
}
class MyPrinter{
    public void print(String str,Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}
