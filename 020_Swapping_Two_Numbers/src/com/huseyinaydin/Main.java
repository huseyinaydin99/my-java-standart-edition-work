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
        int x = 5, y = 4;
        int a = 5,b = 4;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("a ^ b = " + (a ^ b));
        
        a = 5;
        b = 6;
        
        b = a + b - (a = b);
        System.out.println("a b " + a + " - " + b);
        System.out.println("--------------");
        System.out.println((y = x));
        System.out.println((x = y));
    }
    
}
