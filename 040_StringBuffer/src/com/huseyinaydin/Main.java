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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Merhaba");
        stringBuffer.append("Dünya");
        stringBuffer.replace(0, 6, " ");
        System.out.println(stringBuffer.toString());
        stringBuffer.delete(0, 5);
        System.out.println(stringBuffer.toString());
    }
    
}
