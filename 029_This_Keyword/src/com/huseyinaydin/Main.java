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
        Student student = new Student(1,"Hüseyin");
    }
    
}
class Student extends Object{
    private int schoolNu;
    private String name;

    public Student() {
        super();
    }

    public Student(int schoolNu, String name) {
        this.schoolNu = schoolNu;
        this.name = name;
    }

    public int getSchoolNu() {
        return schoolNu;
    }

    public void setSchoolNu(int schoolNu) {
        this.schoolNu = schoolNu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
