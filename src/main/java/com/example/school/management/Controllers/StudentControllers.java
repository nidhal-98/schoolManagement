package com.example.school.management.Controllers;

import com.example.school.management.Models.Student;
import com.example.school.management.Services.StudentServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/students")
public class StudentControllers {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/register")
    public String registerStudent(@RequestBody Student student) {
        studentServices.registerStudent(student);
        return "Student is added";
    }

    /*
    (POST) , Body, row, JSON
    {
        "name" : "Nidhal",
        "gender" : "Male",
        "age" : 25
    }
    */

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentServices.getAllStudents();
    }

}
