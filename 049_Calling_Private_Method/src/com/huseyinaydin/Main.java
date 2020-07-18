/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName("com.huseyinaydin.Test");
        Test test = (Test)c.newInstance();
        Method method = c.getDeclaredMethod("show", null);
        method.setAccessible(true);
        method.invoke(test, null);
    }
    
}
class Test{
    private void show(){
        System.out.println("Selam");
    }
}
