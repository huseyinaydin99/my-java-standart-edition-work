/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        j = i==1?6:7; // i 1'e eşitse 6 yı atar değilse 7 yi atar
        System.out.println(j);
        
        Object obj1;
        Object obj2;
        boolean durum = false;
        
        if(true){
            obj1 = new Integer(10);
        }
        else
            obj1 = new Double(10.1);
        
        obj2 = durum==true?new Integer(10):new Double(20.1);
        System.out.println(obj2);
    }
    
}
