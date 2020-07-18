/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.Random;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i]);
        }
        System.out.println("--------");
        for (int i : array) {
            System.out.println(i);
        }
        try {
            System.out.println(array[52]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Maximumu geçtiniz " + e.getMessage());
        }
        System.out.println("--------");
        int p[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        //System.out.println(p.length + " l");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= p.length; j++) {
                System.out.println(p[i][j]);
            }
        }
        
        int c[][][] = new int[4][3][2];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 2; k++){
                    c[i][j][k] = random.nextInt(50);
                }
            }
        }
        System.out.println("--------");
        for(int i = 0; i < 4; i++){
            System.out.println("--------");
            for(int j = 0; j < 3; j++){
                System.out.println("--------");
                for(int k = 0; k < 2; k++){
                    System.out.println(c[i][j][k]);
                }
            }
        }
        System.out.println("--------");
        for (int[][] ises : c) {
            System.out.println("--------");
            for (int[] e : ises) {
                System.out.println("--------");
                for (int i : e) {
                    System.out.println(i);
                }
            }
        }
        
        int jagged[][] = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[2];
        jagged[2] = new int[2];
    }

}
