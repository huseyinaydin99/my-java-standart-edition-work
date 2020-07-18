/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
    
}
class Q{
    int num;
    boolean valueSet = false;
    public synchronized void put(int num){
        while (valueSet) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.valueSet = true;
        System.out.println("Put: " + num);
        this.num = num;
        notify();
    }
    public synchronized void get(){
        while (!valueSet) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.valueSet = false;
        System.out.println("Get: " + this.num);
        notify();
    }
}
class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {   
            q.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while (true) {            
            q.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
