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
        StringBuilder stringBuilder = new StringBuilder("Merhaba");
        stringBuilder.append(" Dünya");
        System.out.println(stringBuilder.toString());
        stringBuilder.replace(0, 0, " ");
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0, 1);
        System.out.println(stringBuilder.toString());
    }
    
}
