package com.example.school.management.Repositories;

import com.example.school.management.Models.ClassRoom;
import com.example.school.management.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<ClassRoom, Long> {

    List<Class> findAllByisActive(boolean active);

}
