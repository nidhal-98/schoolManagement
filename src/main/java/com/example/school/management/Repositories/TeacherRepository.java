package com.example.school.management.Repositories;

import com.example.school.management.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
