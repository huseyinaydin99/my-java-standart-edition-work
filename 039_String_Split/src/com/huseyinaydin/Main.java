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
        String str = "Hüseyin,Rümeysa,Yasin,Ömer";
        String strArray[] = str.split(",");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
    
}
