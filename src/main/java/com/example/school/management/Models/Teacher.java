package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;

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
}
