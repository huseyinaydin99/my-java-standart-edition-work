/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(10));
        System.out.println(set.add(55));
        System.out.println(set.add(43));
        System.out.println(set.add(10));//aynı değerden bir tane daha almaz
        for (Integer i : set) {
            System.out.println(i);
        }
        Set<Integer> set2 = new TreeSet<>(); //Tree set otomatik olarak değerleri sıraladı
        set2.add(11);
        set2.add(45);
        set2.add(5);
        set2.add(31);
        for (Integer i : set2) {
            System.out.println(i);
        }
    }
    
}
