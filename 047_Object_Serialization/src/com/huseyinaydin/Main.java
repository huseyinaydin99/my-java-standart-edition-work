/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student student = new Student(1, "Hüseyin");
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\Hüseyin\\Documents\\dosya2"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Hüseyin\\Documents\\dosya2"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student)objectInputStream.readObject();
        System.out.println(student1);
    }
    
}
class Student implements Serializable{
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
