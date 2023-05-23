package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long studentID;

    String name;
    String gender;
    Integer age;

    @OneToMany(mappedBy = "Id")
    List<StudentCourse> studentCourses;

}
