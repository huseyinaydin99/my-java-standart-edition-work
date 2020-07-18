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
    /*
    - shallow
    - deep
    - clone
    */
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc abc = new Abc();
        abc.setI(1);
        abc.setJ(2);
        
        Abc abc1 = new Abc();
        abc1.setI(abc.getI());
        abc1.setJ(abc.getJ());
        System.out.println(abc);
        System.out.println(abc1);
        
        Abc abc2 = new Abc();
        abc2 = (Abc)abc.clone();
        System.out.println(abc2);
    }
    
}
class Abc implements Cloneable{
    public int i = 0;
    public int j = 0;

    public Abc() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "Abc{" + "i=" + i + ", j=" + j + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
}
