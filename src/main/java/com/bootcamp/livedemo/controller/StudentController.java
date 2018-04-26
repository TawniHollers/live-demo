package com.bootcamp.livedemo.controller;

import com.bootcamp.livedemo.model.Student;
import com.bootcamp.livedemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students") //can use GetMapping for a GET Method, instead of RequestMapping
    public List<Student> getStudents(){
        return studentService.getStudentlist();
    }
}
