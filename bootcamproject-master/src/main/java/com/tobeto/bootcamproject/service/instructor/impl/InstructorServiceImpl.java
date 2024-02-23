package com.tobeto.bootcamproject.service.instructor.impl;

import com.tobeto.bootcamproject.model.entities.Instructor;
import com.tobeto.bootcamproject.repository.InstructorRepository;
import com.tobeto.bootcamproject.service.instructor.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    @Override
    public Instructor getById(
            Integer instructorId
    ) {
        return instructorRepository.findById(instructorId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye sahip bir Instructor bulunamadı!"));

    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }
}
