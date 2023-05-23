package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
public class Class1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long classID;

    Integer size;

    @OneToMany(mappedBy = "courseID")
    List<Course> courses;
}
