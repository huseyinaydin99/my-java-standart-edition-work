/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Hüseyin
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String os();
    float version();
}
@SmartPhone(os = "Android",version = 4.4f)
class Nokia{
    private String model;
    private int size;

    public Nokia() {
    }

    public Nokia(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Nokia{" + "model=" + model + ", size=" + size + '}';
    }
    
}
@SmartPhone(os = "IOS",version = 0)
class B extends Nokia{
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.run();
        
        Nokia nokia = new Nokia("Fire", 14);
        Class c = nokia.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone)annotation;
        System.out.println(smartPhone.os() + " - " + smartPhone.version());
        
        A a1 = new A();
        Class c2 = a1.getClass();
        Annotation a2 = c2.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone1 = (SmartPhone)a2;
        if(smartPhone1!=null)
            System.out.println(smartPhone1.os() + " - " + smartPhone1.version());
    }
    
}
class A{
    @Deprecated
    public void show(){
        System.out.println("Selam");
    }
    @SuppressWarnings(value = "unchecked")
    public void run(){
        System.out.println("Koş...");
    }
}
