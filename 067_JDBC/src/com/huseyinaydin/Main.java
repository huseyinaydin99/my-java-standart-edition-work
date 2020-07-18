/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hüseyin
 */
/*
import java.sql
load and register the driver
create connection
create a statement
execute the query
process the results
close connection
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uName = "root";
        String password = "toor";
        String query1 = "select * from student;";
        String query2 = "INSERT INTO `aliens`.`student` (`USER_NAME`) VALUES ('ABC');";
        String query3 = "INSERT INTO `aliens`.`student` (`USER_NAME`) VALUES (?);";
        Connection connection = DriverManager.getConnection(url, uName, password);
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(query3);
        preparedStatement.setString(1, "Ali");
        //ResultSet resultSet = statement.executeQuery(query1);
        /*while (resultSet.next()) {            
            System.out.println(resultSet.getString("USER_ID") + " - " + resultSet.getString("USER_NAME"));
            /*resultSet.getInt(1);
            resultSet.getInt(2);*/
        //}
        //int value = statement.executeUpdate(query2);
        int value = preparedStatement.executeUpdate();
        System.out.println(value);
        statement.close();
        connection.close();
    }
    
}
