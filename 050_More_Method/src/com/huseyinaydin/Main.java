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
    public static void main(String[] args) throws ClassNotFoundException {
        Class classB = Class.forName("com.huseyinaydin.B");
        System.out.println(classB.isInterface());
        System.out.println(classB.getSuperclass());
    }
    
}
class A{
    
}
class B extends A{
    
}
