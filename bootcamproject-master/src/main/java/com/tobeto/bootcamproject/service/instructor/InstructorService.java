package com.tobeto.bootcamproject.service.instructor;

import com.tobeto.bootcamproject.model.entities.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor getById(final Integer instructorId);
    List<Instructor> getAllInstructors();
}
