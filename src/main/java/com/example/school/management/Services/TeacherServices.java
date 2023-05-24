package com.example.school.management.Services;

import com.example.school.management.Models.Student;
import com.example.school.management.Models.Teacher;
import com.example.school.management.Repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServices {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id){
        return teacherRepository.findById(id).get();
    }

    public void registerTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }

    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}