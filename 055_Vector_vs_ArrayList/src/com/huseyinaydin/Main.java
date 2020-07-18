/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); //not thread safe - fast
        arrayList.add(22);
        Vector<Integer> vector = new Vector<>(); //thread safe - slow
        vector.add(5);
        vector.add(7);
        System.out.println("Vector capasity: " + vector.capacity());
        System.out.println("Arraylist size: " + arrayList.size());
        for (Integer i : vector) {
            System.out.println(i);
        }
        System.out.println("----");
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
    
}
