package com.example.school.management.Controllers;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.Teacher;
import com.example.school.management.Services.CourseServices;
import com.example.school.management.Services.TeacherServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping(value = "/api/courses")
public class CourseControllers {

    @Autowired
    CourseServices courseServices;

    @PostMapping("/register")
    public String registerCourse(@RequestBody Course course) {
        courseServices.registerCourse(course);
        return "Course is added";
    }
}
