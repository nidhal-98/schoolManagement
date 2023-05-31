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
public class AddCourseResponse {

    String name;
    String description;
    String courseCode;
    Date createdDate;
}