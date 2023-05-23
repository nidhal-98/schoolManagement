package com.example.school.management.Models;

import lombok.*;

import javax.persistence.*;

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
}
