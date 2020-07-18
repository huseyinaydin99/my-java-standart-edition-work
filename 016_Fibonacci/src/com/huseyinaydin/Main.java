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
        int c = 1,x = 1;
        int toplam = 0;
        for(int i = 1; i < 20; i++){
            toplam = x + c;
            c = x;
            x = toplam;
            System.out.print(toplam + " ");
        }
    }
    
}
