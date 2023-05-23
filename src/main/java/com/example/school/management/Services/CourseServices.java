package com.example.school.management.Services;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.Teacher;
import com.example.school.management.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServices {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public void registerCourse(Course course){
        courseRepository.save(course);
    }
}
