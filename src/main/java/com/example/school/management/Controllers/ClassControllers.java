package com.example.school.management.Controllers;

import com.example.school.management.Models.ClassRoom;
import com.example.school.management.Models.Course;
import com.example.school.management.Models.Student;
import com.example.school.management.Services.ClassServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/class")
public class ClassControllers {

    @Autowired
    ClassServices classServices;

    @PostMapping("/register")
    public String registerClass(@RequestBody ClassRoom classRoom) {
        classServices.registerClass(classRoom);
        return "Class is added";
    }

    @GetMapping("/getAllClasses")
    public List<ClassRoom> getAllClasses(){
        return classServices.getAllClass();
    }

    @GetMapping("/getAllCoursesActive")
    public List<ClassRoom> getAllCoursesActive(){
        return classServices.Active();
    }

    @GetMapping("/classBy/{id}")
    public ClassRoom getClassById(@PathVariable("id") Long id){

        return classServices.getClassById(id);
    }

    @PutMapping("/updateClass/{id}")
    public String updateClass(@PathVariable Long id, @RequestBody ClassRoom updatedClassRoom){

        ClassRoom classRoom = classServices.getClassById(id);
        classRoom.setSize(updatedClassRoom.getSize());

        classServices.saveClass(classRoom);

        return "Updated Successfully";
    }

    @DeleteMapping("/deleteClass/{id}")
    public String deleteStudent(@PathVariable Long id){

        classServices.deleteClassById(id);
        return "Deleted Successfully";
    }
}
