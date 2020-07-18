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
        byte a = 25; //11001
        byte b = 15; //01111
                     //11111
                     //01001 ->1'lerin toplamı 9 eder
        int c = a | b;
        System.out.println(c);
        c = a & b; //a ve b'nin byteları(0 ve 1'leri) toplamı herhalde
        System.out.println(c);
    }
    
}
