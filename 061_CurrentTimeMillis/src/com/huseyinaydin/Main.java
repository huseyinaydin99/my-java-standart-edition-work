/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 1000000; i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Şu kadar mili saniye sürdü: " + (end - start));
    }
    
}
