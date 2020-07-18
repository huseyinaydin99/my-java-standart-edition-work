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
        new A().i = 10;
        new A().show();
    }
    
}
class A{
    int i = 5;
    public void show(){
        System.out.println("Selam " + i);
    }
}
