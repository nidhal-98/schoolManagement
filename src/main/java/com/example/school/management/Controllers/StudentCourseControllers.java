package com.example.school.management.Controllers;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.StudentCourse;
import com.example.school.management.Services.StudentCourseServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/StudentCourse")
public class StudentCourseControllers {

    @Autowired
    StudentCourseServices studentCourseServices;

    @PostMapping("/register")
    public String registerStudentCourse(@RequestBody StudentCourse studentCourse) {
        studentCourseServices.registerStudentCourse(studentCourse);
        return "Done";
    }

    @GetMapping("/getAllStudentCourses")
    public List<StudentCourse> getAllStudentCourses(){
        return studentCourseServices.getAllStudentCourse();
    }

    @GetMapping("/StudentCourseBy/{id}")
    public StudentCourse getStudentCourseById(@PathVariable("id") Long id){
        return studentCourseServices.getStudentCourseById(id);
    }

    @PutMapping("/updateStudentCourse/{id}")
    public String updateStudentCourse(@PathVariable Long id, @RequestBody StudentCourse updatedStudentCourse){

        StudentCourse studentCourse = studentCourseServices.getStudentCourseById(id);
        studentCourse.setGarde(updatedStudentCourse.getGarde());

        studentCourseServices.saveStudentCourse(studentCourse);

        return "Updated Successfully";
    }

    @DeleteMapping("/deleteStudentCourse/{id}")
    public String deleteStudentCourse(@PathVariable Long id){

        studentCourseServices.deleteStudentCourseById(id);
        return "Deleted Successfully";
    }
}
