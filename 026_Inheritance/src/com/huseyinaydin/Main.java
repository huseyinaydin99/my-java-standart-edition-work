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
        Add add = new Add();
        add.add(10, 10);
        System.out.println(add.result);
        
        Sub sub = new Sub();
        sub.sub(10, 5);
        System.out.println(sub.result);
        
        Multi multi = new Multi();
        multi.multi(2, 5);
        System.out.println(multi.result);
        
        Add hepsiBirArada = new Multi();
        ((Multi)hepsiBirArada).sub(10, 5);
        System.out.println(((Multi)hepsiBirArada).result);
    }
    
}
class Add{ //parent super base
    public Add(){
        System.out.println("Add hazırlandı");
    }
    int result = 0;
    public void add(int num1,int num2){
        result = num1 + num2;
    }
}
class Sub extends Add{ //child sub derived
    
    public Sub(){
        System.out.println("Sub hazırlandı");
    }

    public void sub(int num1, int num2) {
        result = num1 - num2;
    }
}
class Multi extends Sub{ //multi level inheritance
    
    public Multi(){
        System.out.println("Multi hazırlandı");
    }

    public void multi(int num1, int num2) {
        result = num1 * num2;
    }
}
