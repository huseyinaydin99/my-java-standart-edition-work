/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.IOException;

/**
 *
 * @author Hüseyin
 */
public class InReadMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*int i = System.in.read();
        System.out.println(i);*/
        int i = 0;
        String str = "";
        while ((i = System.in.read())!=48) {   
            System.out.println("While " + i + " " + (char)i);
            str += (char)i;
        }
        System.out.println(str);
    }
    
}
