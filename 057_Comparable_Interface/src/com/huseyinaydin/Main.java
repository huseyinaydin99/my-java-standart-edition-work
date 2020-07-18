/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(11, "Hüseyin"));
        list.add(new Student(5, "Ahmet"));
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }
        list.stream().forEach(i->System.out.println(i));
    }
    
}
class Student implements Comparable<Student>{
    private Integer nu;
    private String name;

    public Student(Integer nu, String name) {
        this.nu = nu;
        this.name = name;
    }

    public Integer getNu() {
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
    public int compareTo(Student t) {
        System.out.println("compara çalıştı");
        return this.nu.compareTo(t.nu);
    }

    @Override
    public String toString() {
        return "Student{" + "nu=" + nu + ", name=" + name + '}';
    }
    
}
