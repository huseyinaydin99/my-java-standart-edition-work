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
        int num1 = 8;
        if(num1 % 2 == 0)
            System.out.println("Bölünebilir");
        else
            System.out.println("Bölünemez");
        
        int a = 10;
        int b = 5;
        int c = 11;
        if(a > b && a > c)
            System.out.println("A Büyük");
        else if(c > b && c > a)
            System.out.println("C Büyük");
        else
            System.out.println("B Büyük");
    }
    
}
