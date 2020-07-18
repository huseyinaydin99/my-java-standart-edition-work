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
        Abc abc = new Abc(1,10.1);
    }
    
}
class Abc{
    private int i;
    private double b;
    public Abc() {
        System.out.println("1 Örnek hazırlandı");
    }
    
    public Abc(int i) {
        System.out.println("2 Örnek hazırlandı");
        this.i = i;
    }
    
    public Abc(int i,double b) {
        System.out.println("3 Örnek hazırlandı");
        this.i = i;
        this.b = b;
    }
    
}
