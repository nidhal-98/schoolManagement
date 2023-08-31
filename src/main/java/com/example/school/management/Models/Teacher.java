package com.example.school.management.Models;

import lombok.*;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long teacherID;

    String name;
    String specialization;

    Long phoneNumber;

    Integer age;

    @OneToOne
    @JoinColumn(name = "course_id")
    Course course;
}
