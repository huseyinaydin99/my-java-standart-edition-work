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
        Student student = new Student(1, "Hasan", "Bal");
        Student student2 = new Student();
        student2.setSchoolNu(2);
        student2.setName("Hüseyin");
        student2.setSurname("Aydın");
    }
    
}
class Student{
    private int schoolNu;
    private String name,surname;

    public Student() {
    }

    public Student(int schoolNu, String name, String surname) {
        this.schoolNu = schoolNu;
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
}
