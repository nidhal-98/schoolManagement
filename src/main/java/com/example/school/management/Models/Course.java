package com.example.school.management.Models;

import lombok.*;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long courseID;

    String name;
    String description;

    String courseCode;

    Date createdDate;
    Boolean isActive;
    Date updatedDate;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "class_id")
    ClassRoom classRoom;

    @OneToMany(mappedBy = "course")
    List<StudentCourse> studentCourses;
}