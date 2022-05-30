package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path =  "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
       return Arrays.asList(
                new Student(1L, "Cam", "Cam@email.com", Gender.Female),
                new Student(2L, "Abe", "Abe@email.com", Gender.Male)
                );

    }
}
