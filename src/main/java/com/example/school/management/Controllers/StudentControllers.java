package com.example.school.management.Controllers;

import com.example.school.management.Models.Student;
import com.example.school.management.Services.StudentServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/students")
public class StudentControllers {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/register")
    public List<Student> registerStudent(@RequestBody Student student) {
        studentServices.registerStudent(student);
        List<Student> allStudents = studentServices.getAllStudents();
        return allStudents;
    }

    /*
    (POST) , Body, row, JSON
    {
        "name" : "Nidhal",
        "gender" : "Male",
        "age" : 25
    }
    */

}
