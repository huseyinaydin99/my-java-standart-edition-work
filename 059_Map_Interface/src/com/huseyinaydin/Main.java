/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
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
        Map<String,String> map = new HashMap<>();//not thread safe / fast
        map.put("1", "Hüseyin");
        map.put("2", "Abc");
        map.put("3", "Cba");
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(map.get("2"));
        
        Set<Map.Entry<String,String>> entrys = map.entrySet();
        for (Map.Entry<String, String> entry : entrys) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        Map<String,Integer> map1 = new Hashtable<>();//thread safe / slow
        map1.put("Hüseyin", 1);
        map1.put("Ali", 2);
        map1.put("Veli", 3);
        
        Set<String> strings1 = map1.keySet();
        for (String s : strings1) {
            System.out.println(s);
        }
        System.out.println(map1.get("2"));
        
        Set<Map.Entry<String,Integer>> entrys1 = map1.entrySet();
        for (Map.Entry<String, Integer> entry : entrys1) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
    }
    
}
