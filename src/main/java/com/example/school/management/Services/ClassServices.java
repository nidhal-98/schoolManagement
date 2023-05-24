package com.example.school.management.Services;

import com.example.school.management.Models.Class1;
import com.example.school.management.Models.Course;
import com.example.school.management.Repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServices {

    @Autowired
    ClassRepository classRepository;

    public List<Class1> getAllClass(){
        return classRepository.findAll();
    }

    public Class1 getClassById(Long id){
        return classRepository.findById(id).get();
    }

    public void registerClass(Class1 class1){
        classRepository.save(class1);
    }
}
