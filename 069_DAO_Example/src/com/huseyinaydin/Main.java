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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getStudent(10);
        System.out.println(student);
        
        Student student1 = new Student(6, "Ahmet");
        if(studentDAO.addStudent(student1))
            System.out.println("Kayıt yapıldı");
        else
            System.out.println("Başarısız");
    }
    
}
class StudentDAO{
    Connection connection;
    public void connectToMysqlDataBase() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uName = "root";
        String password = "toor";        
        this.connection = DriverManager.getConnection(url, uName, password);
    }
    public Student getStudent(int nu) throws ClassNotFoundException, SQLException{
        this.connectToMysqlDataBase();
        String query1 = "select * from student where USER_ID=2;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query1);
        resultSet.next();
        String s = resultSet.getString("USER_NAME");
        String s2 = resultSet.getString("USER_ID");
        resultSet.close();
        statement.close();
        connection.close();
        Student student = new Student();
        student.setNu(nu);
        student.setName(s);
        return student;
    }
    public boolean addStudent(Student student) throws SQLException, ClassNotFoundException{
        this.connectToMysqlDataBase();
        String query = "INSERT INTO `aliens`.`student` (`USER_NAME`) VALUES (?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        int v = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        if(v != 0)
            return true;
        else
            return false;
    }
}
class Student{
    private int nu;
    private String name;

    public Student() {
    }
    
    public Student(int nu, String name) {
        this.nu = nu;
        this.name = name;
    }

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "nu=" + nu + ", name=" + name + '}';
    }
    
}
