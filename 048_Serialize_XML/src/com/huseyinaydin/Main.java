/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "Hüseyin");
            Student student2 = new Student(2, "Yasin");
            List<Student> students = new ArrayList<>();
            students.add(student);
            students.add(student2);
            College college = new College();
            college.setStudents(students);

            XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(new File("dosya_x")));
            xmlEncoder.writeObject(college);
            xmlEncoder.flush();
            xmlEncoder.close();
            
            XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(new File("dosya_x")));
            College college1 = (College)xmlDecoder.readObject();
            for (Student s: college1.students) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static class College {

        public List<Student> students;

        public List<Student> getStudents() {
            return students;
        }

        public void setStudents(List<Student> students) {
            this.students = students;
        }

    }

    public static class Student implements Serializable {

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

}
