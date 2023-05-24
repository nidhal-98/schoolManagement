package com.example.school.management.Services;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.Student;
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

    public Course getCourseById(Long id){
        return courseRepository.findById(id).get();
    }

    public void deleteCourseById(Long id){
        courseRepository.deleteById(id);
    }

    public void registerCourse(Course course){
        courseRepository.save(course);
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
}
