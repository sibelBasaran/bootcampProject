package com.tobeto.bootcamproject.controller;

import com.tobeto.bootcamproject.core.mapper.ModelMapperService;
import com.tobeto.bootcamproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcamproject.model.dto.instructor.response.InstructorResponse;
import com.tobeto.bootcamproject.model.entities.Instructor;
import com.tobeto.bootcamproject.service.instructor.InstructorCreateService;
import com.tobeto.bootcamproject.service.instructor.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorCreateService instructorCreateService;
    private final InstructorService instructorService;
    private final ModelMapperService modelMapperService;


    // TODO: instructor oluşturma
    // TODO: instrur'a id üzerinden erişme
    // TODO: bütün instructorlara erişme
    // TODO: url üzerinden belirtilen instructarı güncelleyen endpoint
    // TODO: id değeri url üzerinden belirtilen instructorı silen endpoint

    //create
    @PostMapping
    public Instructor createInstructor(
            @RequestBody final InstructorCreateRequest instructorCreateRequest
    ) {
        final Instructor createdInstructor = instructorCreateService.create(instructorCreateRequest);

        return createdInstructor;
    }
    //get by id
    @GetMapping("/{instructorId}")
    public InstructorResponse getById(
            @PathVariable("instructorId") final Integer instructorId
    ) {
        Instructor instructor = instructorService.getById(instructorId);
        InstructorResponse instructorResponse = modelMapperService.forResponse()
                .map(instructor,InstructorResponse.class);
        return instructorResponse;

    }

    //get all
    @GetMapping
    public List<Instructor> getAllInstructor(){
        return  instructorService.getAllInstructors();
    }


}
