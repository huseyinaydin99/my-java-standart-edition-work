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
        int n = 6;
        boolean b = isPerfect(n);
        if(b)
            System.out.println("Mükemmel sayı");
        else
            System.out.println("Mükemmel sayı değil");
    }
    
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(n == sum)
            return true;
        return false;
    }
    
}
