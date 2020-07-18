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
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        
        int j = 15;
        do{
            System.out.println(j);
            j++;
        }while(j < 10);
        
        for(int k = 0; k < 10; k++){
            System.out.println(k);
        }
    }
    
}
