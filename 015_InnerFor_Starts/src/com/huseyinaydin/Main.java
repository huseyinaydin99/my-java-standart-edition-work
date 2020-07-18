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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0){
                    System.out.print("*");
                }
                else if(i == 1){
                    if(j == 1 || j == 2 || j == 3){
                        System.out.print(" ");
                    }
                    else
                        System.out.print("*");
                }
                else if(i == 2){
                    if(j == 1 || j == 2 || j == 3){
                        System.out.print(" ");
                    }
                    else
                        System.out.print("*");
                }
                else if(i == 3){
                    if(j == 1 || j == 2 || j == 3){
                        System.out.print(" ");
                    }
                    else
                        System.out.print("*");
                }
                else if(i == 4){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        
        for(int i = 4; i >= 0; i--){
            for(int j = i; j < 4; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        boolean durum = true;
        for(int i = 5; i >= 0; i--){
            for(int j = i; j < 5; j++){
                if(durum)
                    System.out.print("1");
                else
                    System.out.print("0");
                durum = !durum;
            }
            System.out.println("");
        }
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println("");
        }
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
