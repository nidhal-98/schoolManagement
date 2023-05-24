package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "courseID")
    List<Course> courses;
}
