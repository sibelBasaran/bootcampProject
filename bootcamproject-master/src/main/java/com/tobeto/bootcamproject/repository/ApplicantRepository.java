package com.tobeto.bootcamproject.repository;

import com.tobeto.bootcamproject.model.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
}
