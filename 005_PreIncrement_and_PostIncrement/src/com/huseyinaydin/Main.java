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
        byte j = 0;
        byte i = 0;
        i = j++;
        System.out.println(i);
        j = 0;
        i = ++j;
        System.out.println(i);
        
        i = 0;
        byte temp = i;
        i++;
        i = temp;
        System.out.println("temp: " + temp + " i: " + i);
    }
    
}
