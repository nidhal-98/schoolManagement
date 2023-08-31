package com.example.school.management.Models;

import lombok.*;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long classID;

    Integer size;

    String classCode;

    Date createdDate;
    Boolean isActive;
    Date updatedDate;

    @OneToMany(mappedBy = "classRoom")
    List<Course> courses;
}
