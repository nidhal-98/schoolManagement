package com.example.school.management.Services;

import com.example.school.management.Models.ClassRoom;
import com.example.school.management.Models.Course;
import com.example.school.management.Models.Student;
import com.example.school.management.Repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServices {

    @Autowired
    ClassRepository classRepository;

    public List<ClassRoom> getAllClass(){
        return classRepository.findAll();
    }

    public List<ClassRoom> Active(){
        return classRepository.findAllByisActive(true);
    }

    public ClassRoom getClassById(Long id){
        return classRepository.findById(id).get();
    }

    public void deleteClassById(Long id){
        classRepository.deleteById(id);
    }

    public void registerClass(ClassRoom classRoom){
        classRepository.save(classRoom);
    }

    public ClassRoom saveClass(ClassRoom classRoom){
        return classRepository.save(classRoom);
    }

}
