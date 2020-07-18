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
        Display display = new Display();
        display.show(10,20,30);
    }
    
}
class Display{
    public void show(int ...a){
        for (int i : a) {
            System.out.println(i);
        }
    }
}
