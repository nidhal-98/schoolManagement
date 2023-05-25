package com.example.school.management.Controllers;

import com.example.school.management.Models.Course;
import com.example.school.management.Models.Student;
import com.example.school.management.Requests.AddStudentRequest;
import com.example.school.management.Responses.AddStudentResponse;
import com.example.school.management.Services.StudentServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/students")
public class StudentControllers {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/register")
    public String registerStudent(@RequestBody Student student) {
        studentServices.registerStudent(student);
        return "Student is added";
    }

    /*
    (POST) , Body, row, JSON
    {
        "name" : "Nidhal",
        "gender" : "Male",
        "age" : 25
    }
    */

    @GetMapping("/getAllStudents")
    public List<AddStudentResponse> getAllStudents(){

        List<Student> students = studentServices.getAllStudents();
        List<AddStudentResponse> responses = new ArrayList<>();

        for(Student student : students){
            AddStudentResponse response = new AddStudentResponse(
                    student.getStudentID(),
                    student.getName(),
                    student.getAge(),
                    student.getGender(),
                    student.getCreatedDate()
            );

            responses.add(response);
        }
        return responses;
    }

    /*@GetMapping("/getAllStudentsActive")
    public List<Student> getAllStudentsActive(){
        return studentServices.getAllStudentsActive();
    }*/

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentServices.getStudentById(id);
    }

    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent){

        Student student = studentServices.getStudentById(id);
        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());
        student.setGender(updatedStudent.getGender());
        studentServices.saveStudent(student);

        return "Updated Successfully";
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id){

        studentServices.deleteStudentById(id);
        return "Deleted Successfully";
    }
}
