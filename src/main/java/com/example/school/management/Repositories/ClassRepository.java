package com.example.school.management.Repositories;

import com.example.school.management.Models.Class1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class1, Long> {
}
