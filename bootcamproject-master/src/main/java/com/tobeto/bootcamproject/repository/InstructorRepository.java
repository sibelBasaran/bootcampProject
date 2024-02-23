package com.tobeto.bootcamproject.repository;

import com.tobeto.bootcamproject.model.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
}
