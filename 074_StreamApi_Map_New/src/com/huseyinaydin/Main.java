/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.R;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strStudent = "Ali,Veli,Deli";
        Stream<String> streamStudent = Arrays.stream(strStudent.split(","));
        Stream<String> streamStudentt = Arrays.stream(strStudent.split(","));
        Stream<Student> streamStudent2 = streamStudent.map(Student::new);
        Stream<Student> streamStudent3 = streamStudentt.map(new Function<String, Student>(){
            @Override
            public Student apply(String s) {
                return new Student(s);
            }
        });
        List<Student> students = streamStudent2.collect(Collectors.toList());
        List<Student> students2 = streamStudent3.collect(Collectors.toList());
        students.forEach(System.out::println);
        System.out.println("----------");
        students.forEach(s->System.out.println(s.getName()));
        System.out.println("----------");
        students2.forEach(s->System.out.println(s.getName()));
    }
    
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
