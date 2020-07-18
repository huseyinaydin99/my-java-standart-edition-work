/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });
        System.out.println("----------");
        integers.forEach((t)->System.out.println(t));
        System.out.println("----------");
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        };
        Consumer<Integer> c2 = (t)->{
            
        };
        integers.forEach(c2);
        System.out.println("----------");
        Consumer<Integer> c3 = (t)->System.out.println(t);
        integers.forEach(c3);
        
        System.out.println("----------");
        integers.forEach(t->System.out.println(t));
        System.out.println("----------");
        integers.forEach(System.out::println);
        System.out.println("----------");
        integers.forEach(t->doubleIt(t));
        System.out.println("----------");
        integers.forEach(Main::doubleIt);
        System.out.println("----------");
        integers.stream().forEach(Main::doubleIt);
    }
    
    public static void doubleIt(int i)
    {
        System.out.println(i * 2);
    }    
}
