/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.time.*;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1994, Month.SEPTEMBER, 11);
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time2 = LocalTime.of(20, 5);
        System.out.println(time2);
        
        LocalTime time3 = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(time3);
        
        Instant instant = Instant.now();
        System.out.println(instant);
        
        for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
    }
    
}
