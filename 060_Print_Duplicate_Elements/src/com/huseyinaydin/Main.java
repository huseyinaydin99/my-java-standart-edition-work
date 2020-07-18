/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hüseyin");
        arrayList.add("Ahmet");
        arrayList.add("Veli");
        arrayList.add("Hüseyin");
        Set<String> set = new HashSet<>();
        for (String string : arrayList) {
            if(!set.add(string))
                System.out.println("listeye eklenemiyen eleman(zaten listede var) " + string);
        }
    }
    
}
