package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once!
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Jerry", "Mack"));
        theStudents.add(new Student("Marissa", "Mack"));
        theStudents.add(new Student("Kentrell", "Mack"));
        theStudents.add(new Student("Elia", "Mack"));
        theStudents.add(new Student("Zo", "Mack"));
    }

    // define an endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents (){

        return theStudents;
    }

    // define endpoint for "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        //index into the list ... keep it simple!
        return theStudents.get(studentId);
    }
}
