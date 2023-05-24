package com.example.school.management.Controllers;

import com.example.school.management.Models.Course;
import com.example.school.management.Services.CourseServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses(){
        return courseServices.getAllCourses();
        /*
        localhost:8080/api/courses/getAllCourses
         */
    }

    @GetMapping("/courseBy/{id}")
    public Course getCourseById(@PathVariable("id") Long id){

        return courseServices.getCourseById(id);
    }

    @PutMapping("/updateCourse/{id}")
    public String updateCourse(@PathVariable Long id, @RequestBody Course updatedCourse){

        Course course = courseServices.getCourseById(id);
        course.setName(updatedCourse.getName());
        course.setDescription(updatedCourse.getDescription());

        courseServices.saveCourse(course);

        return "Updated Successfully";
    }
}


/*
git config --global user.name "nidhal-98"

git config --global user.email "nidhalsalim98@gmail.com"
*/
