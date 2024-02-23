package com.tobeto.bootcamproject.service.instructor.impl;

import com.tobeto.bootcamproject.core.mapper.ModelMapperService;
import com.tobeto.bootcamproject.repository.InstructorRepository;
import com.tobeto.bootcamproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcamproject.model.entities.Instructor;
import com.tobeto.bootcamproject.service.instructor.InstructorCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstructorCreateServiceImpl implements InstructorCreateService {
    private final InstructorRepository instructorRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Instructor create(
            final InstructorCreateRequest instructorCreateRequest
    ) {
        final Instructor instructorToBeSave = modelMapperService.forRequest()
                .map(instructorCreateRequest,Instructor.class);

        return instructorRepository.save(instructorToBeSave);
    }
}
