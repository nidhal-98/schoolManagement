package com.example.school.management.Requests;

import com.example.school.management.Models.Student;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequest {

    Long studentID;
    String name;
    String gender;
    Integer age;
    String email;

    public Student convertToStudent(){

        Date currentDate = new Date();

        Student student = new Student();
        student.setName(this.getName());
        student.setGender(this.getGender());
        student.setAge(this.getAge());
        student.setIsActive(true);
        student.setCreatedDate(currentDate);
        student.setUpdatedDate(currentDate);

        return student;
    }
}
