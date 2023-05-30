package com.example.school.management.Requests;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseRequest {

    String name;
    String description;
    String courseCode;

    public Course convertToCourse(){

        Date currentDate = new Date();

        Course course = new Course();
        course.setName(this.getName());
        course.setDescription(this.getDescription());
        course.setCourseCode(this.getCourseCode());
        course.setIsActive(true);
        course.setCreatedDate(currentDate);
        course.setUpdatedDate(currentDate);


        return course;
    }
}
