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
        int num = 30;
        boolean isPrime = false;
        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                isPrime = true;
                break;
            }
        }
        if(isPrime)
            System.out.println("Bölünebilir");
        else
            System.out.println("Bölünemez");
    }
    
}
