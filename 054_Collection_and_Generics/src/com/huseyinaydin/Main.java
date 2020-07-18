/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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
        Collection collection = new ArrayList();
        collection.add("Hüseyin");
        collection.add(10);
        collection.add(5.7f);
        /*Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }*/
        for (Object o : collection) {
            System.out.println(o);
        }
        
        Collection<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.remove(10);
        System.out.println("--------------");
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(12);
        list.add(44);
        list.add(25);
        Collections.sort(list);
        list.forEach(System.out::println);
        Collections.reverse(list);
    }
    
}
