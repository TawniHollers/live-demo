package com.bootcamp.livedemo.service;

import com.bootcamp.livedemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private List<Student> studentlist = new ArrayList<>();

    public StudentService(){
        Student student1 = new Student();
        student1.setName("Shahar");
        student1.setAge(23);
        Student student2 = new Student("Victor", 25);
        Student student3 = new Student("Noelle", 24);
        Student student4 = new Student("Mariano", 25);

        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
    }

    public List<Student> getStudentlist() {
        return studentlist;
    }
}
