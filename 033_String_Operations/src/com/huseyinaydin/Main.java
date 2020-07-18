/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.Scanner;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1,s2,s3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 tane string giriniz: ");
        s1 = scanner.next();
        s2 = scanner.next();
        int l1 = s1.length();
        int l2 = s2.length();
        s3 = s1.concat(s2);
        System.out.println("İkisinin birleşimi: " + s3);
        System.out.println("1.'nin uzunluğu : " + l1);
        System.out.println("2.'nin uzunluğu : " + l2);
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
    }
    
}
