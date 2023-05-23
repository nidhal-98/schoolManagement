package com.example.school.management.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
@Table(name = "studentCourses")
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    Float garde;

    @ManyToOne
    Student student;

    @ManyToOne
    Course course;
}
