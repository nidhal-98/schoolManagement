package com.example.school.management.Services;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.StudentCourse;
import com.example.school.management.Repositories.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseServices {

    @Autowired
    StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentCourse(){
        return studentCourseRepository.findAll();
    }

    public StudentCourse getStudentCourseById(Long id){
        return studentCourseRepository.findById(id).get();
    }

    public void registerStudentCourse(StudentCourse studentCourse){
        studentCourseRepository.save(studentCourse);
    }
}
