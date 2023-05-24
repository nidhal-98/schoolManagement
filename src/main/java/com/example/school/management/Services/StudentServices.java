package com.example.school.management.Services;

import com.example.school.management.Models.Student;
import com.example.school.management.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}