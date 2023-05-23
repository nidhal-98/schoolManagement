package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;

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

    @OneToOne
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "class_id")
    Class1 class1;
}
