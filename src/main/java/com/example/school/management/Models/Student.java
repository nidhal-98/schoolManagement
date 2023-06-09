package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
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

    String email;

    Date createdDate;
    Boolean isActive;
    Date updatedDate;

    @OneToMany(mappedBy = "student")
    List<StudentCourse> studentCourses;
}
