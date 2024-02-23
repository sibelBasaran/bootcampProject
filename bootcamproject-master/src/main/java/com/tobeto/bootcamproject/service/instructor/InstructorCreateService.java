package com.tobeto.bootcamproject.service.instructor;

import com.tobeto.bootcamproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcamproject.model.entities.Instructor;

public interface InstructorCreateService {
    Instructor create(
            final InstructorCreateRequest instructorCreateRequest
    );
}
