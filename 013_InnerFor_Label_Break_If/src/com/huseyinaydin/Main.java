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
        huseyin:
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 2)
                    break huseyin;
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
