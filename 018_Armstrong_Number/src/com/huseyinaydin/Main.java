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
        int n = 10;
        int temp = n;
        int r,sum = 0;
        while(n>0){
            r = n % 10;
            n = n % 10;
            sum += r * r * r;
            System.out.println("devam ediyor");
        }
        
        if(sum == temp)
            System.out.println("Bu bir armstrong numarasıdır");
        else
            System.out.println("Değildir");
    }
    
}
