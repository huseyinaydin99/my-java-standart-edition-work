/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.huseyinaydin.Pqr");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Pqr p = new Pqr();
        
    }
    
}
class Pqr{
    static{
        System.out.println("in static(statiğin içinde)");
    }
    //in instance(örnek içinde)
    {
        System.out.println("in instance(örneğin içinde)");
    }
}
