package com.example.school.management.Responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentResponse {

    Long id;
    String name;
    Integer age;
    String gender;
    Date createdDate;
}
