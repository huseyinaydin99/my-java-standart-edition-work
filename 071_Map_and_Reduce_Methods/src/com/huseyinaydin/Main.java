/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static boolean durum = false;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        // 2,4,6,8,10,12 = 42
        /*Stream<Integer> s = list.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer t) {
                //System.out.println(t);
                if(t == 2)//bütün listenin elemanları buraya geliyor ve o anki eleman 2 ise geriye 0 dönderiliyor.
                    return 0;
                return t;
            }
        });//map demek harita demektir. bütün listeyi saydırır.
        
        Stream<Integer> s1 = list.stream().map((t)->{
            if(t == 3)
                return 0;
            return t;
        });
        
        s.forEach((t)->System.out.println(t));
        s1.forEach(System.out::println);
        
        
        Optional<Integer> o = list.stream().reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                //System.out.println(t + " - " + u);
                return t;
            }
        });
        
        Optional<Integer> o2 = list.stream().reduce((t,u)->{
            System.out.println(t + " - " + u);
           if(!durum){
               Main.setDurum(true);
               return 1;
           }
           return u; 
        });*/
        
        System.out.println("-------------");
        
        /*System.out.println(list.stream().map((t)->t*2).reduce(0,(t,t1)->{
            System.out.println(t + " -- " + t1);
            return t+t1;
        }));*/
        Stream<Integer> streamX = list.stream().map((t)->{
           return (t * 2); 
        });
        //streamX.forEach(i->System.out.println(i));
        streamX.reduce((t1,t2)->{
            System.out.println(t1 + " + " + t2 + " = " + (t1 + t2));
            return Integer.sum(t1, t2);
            //t1 geriye dönderildikten bir sonraki değerdir
        });
        
        Stream<Integer> streamY = list.stream().filter(i->i % 5 == 0);
        Optional<Integer> o = streamY.reduce((t1,t2)->Integer.sum(t1, t2));
        System.err.println(o.get());
        
        Stream<Integer> streamR = list.stream().map(i->i*2);
        Integer i1 = streamR.findFirst().orElse(0);
        System.out.println(i1);
        
        Stream<Integer> streamU = list.stream().filter(Main::isDivisible);
        streamU = streamU.map(Main::mapDouble);
        Optional<Integer> o1 = streamU.reduce((t1,t2)->Integer.sum(t1, t2));
        System.err.println(o1.get());
        
                  
        //System.out.println(o.get());
        System.out.println("-------------");
        System.out.println("-------------");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        
    }
    
    private static boolean isDivisible(int i){
        return i % 5 == 0;
    }
    
    private static int mapDouble(int i){
        return i * 2;
    }
    
    private static void setDurum(boolean durum){
        Main.durum = durum;
    }
    
}
