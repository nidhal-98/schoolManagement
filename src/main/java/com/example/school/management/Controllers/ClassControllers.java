package com.example.school.management.Controllers;

import com.example.school.management.Models.Class1;
import com.example.school.management.Models.Course;
import com.example.school.management.Models.Teacher;
import com.example.school.management.Services.ClassServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/class")
public class ClassControllers {

    @Autowired
    ClassServices classServices;

    @PostMapping("/register")
    public String registerClass(@RequestBody Class1 class1) {
        classServices.registerClass(class1);
        return "Class is added";
    }

    @GetMapping("/getAllClasses")
    public List<Class1> getAllClasses(){
        return classServices.getAllClass();
    }

    @GetMapping("/classBy/{id}")
    public Class1 getClassById(@PathVariable("id") Long id){

        return classServices.getClassById(id);
    }
}
