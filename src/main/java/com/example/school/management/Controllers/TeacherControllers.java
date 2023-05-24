package com.example.school.management.Controllers;

import com.example.school.management.Models.Student;
import com.example.school.management.Models.Teacher;
import com.example.school.management.Services.TeacherServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping(value = "/api/teachers")
public class TeacherControllers {

    @Autowired
    TeacherServices teacherServices;

    @PostMapping("/register")
    public String registerTeacher(@RequestBody Teacher teacher) {
        teacherServices.registerTeacher(teacher);
        return "Teacher is added";
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherServices.getAllTeachers();
    }

    @GetMapping("/teacherBy/{id}")
    public Teacher getTeacherById(@PathVariable("id") Long id){
        return teacherServices.getTeacherById(id);
    }

}
