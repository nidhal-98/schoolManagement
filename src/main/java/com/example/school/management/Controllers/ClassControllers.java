package com.example.school.management.Controllers;

import com.example.school.management.Models.ClassRoom;
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
    public String registerClass(@RequestBody ClassRoom classRoom) {
        classServices.registerClass(classRoom);
        return "Class is added";
    }

    @GetMapping("/getAllClasses")
    public List<ClassRoom> getAllClasses(){
        return classServices.getAllClass();
    }

    @GetMapping("/classBy/{id}")
    public ClassRoom getClassById(@PathVariable("id") Long id){

        return classServices.getClassById(id);
    }
}
