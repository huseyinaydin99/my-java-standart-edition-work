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
        int i = 5;
        Integer integer = new Integer(i);
        int value = integer.intValue();
        System.out.println(value);
        Integer jj = integer;
        int j = jj.intValue();
        int k = j;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.forEach(t -> {
            System.out.println(t);
        });
    }
    
}
