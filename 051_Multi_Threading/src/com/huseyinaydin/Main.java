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
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        });
        
        thread1.setName("Kanal 1");
        thread2.setName("Kanal 2");
        System.out.println(thread1.getName() + " - " + thread2.getName());
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println(thread1.getPriority() + " - " + thread2.getPriority());
        
        thread1.start();
        Thread.sleep(500);
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Bye");
        if(thread1.isAlive())
            System.out.println("Thread1 hayatta");
        else
            System.out.println("Thread1 öldü");
        if(thread2.isAlive())
            System.out.println("Thread2 hayatta");
        else
            System.out.println("Thread2 öldü");
    }

}
/*class Hi implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    } 
}
class Hello implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    } 
}*/
