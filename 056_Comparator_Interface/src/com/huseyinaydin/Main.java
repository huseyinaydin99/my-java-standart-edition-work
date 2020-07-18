/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(55);
        list.add(10);
        list.add(26);
        
        Collections.sort(list, (o1,o2)->{
            return o1.compareTo(o2);
        });
        for (Integer i : list) {
            System.out.println(i);
        }
    }
    
}
