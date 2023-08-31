package com.example.school.management.Models;

import lombok.*;

import jakarta.persistence.*;
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
    private Long studentID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Date createdDate;

    @Column(nullable = false)
    private Boolean isActive;

    @Column
    private Date updatedDate;

    @OneToMany(mappedBy = "student")
    List<StudentCourse> studentCourses;
}
