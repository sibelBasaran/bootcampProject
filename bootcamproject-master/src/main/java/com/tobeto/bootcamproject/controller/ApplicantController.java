package com.tobeto.bootcamproject.controller;

import com.tobeto.bootcamproject.core.mapper.ModelMapperService;
import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcamproject.model.dto.applicant.response.ApplicantResponse;
import com.tobeto.bootcamproject.model.entities.Applicant;
import com.tobeto.bootcamproject.service.applicant.ApplicantCreateService;
import com.tobeto.bootcamproject.service.applicant.ApplicantDeleteService;
import com.tobeto.bootcamproject.service.applicant.ApplicantService;
import com.tobeto.bootcamproject.service.applicant.ApplicantUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/applicants")
@RequiredArgsConstructor
public class ApplicantController {
    private final ApplicantCreateService applicantCreateService;
    private final ApplicantDeleteService applicantDeleteService;
    private final ApplicantUpdateService applicantUpdateService;
    private final ApplicantService applicantService;
    private final ModelMapperService modelMapperService;

    @PostMapping
    public Applicant createApplicant(
            @RequestBody final ApplicantCreateRequest applicantCreateRequest
    ) {
        final Applicant createdApplicant = applicantCreateService
                .create(applicantCreateRequest);

        return createdApplicant;
    }

    @PutMapping("/{applicantId}")
    public Applicant updateApplicantById(
            @PathVariable("applicantId") final Integer applicantId,
            @RequestBody final ApplicantUpdateRequest applicantUpdateRequest
    ) {
        final Applicant updatedApplicant = applicantUpdateService
                .update(applicantId,applicantUpdateRequest);

        return updatedApplicant;
    }

    @DeleteMapping("/{applicantId}")
    public void deleteApplicant(
            @PathVariable("applicantId") final Integer applicantId
    ) {
        applicantDeleteService.delete(applicantId);
    }

    @GetMapping("/{applicantId}")
    public ApplicantResponse getById(
            @PathVariable("applicantId") final Integer applicantId
    ) {
        Applicant applicant = applicantService.getById(applicantId);
        ApplicantResponse applicantResponse = modelMapperService.forResponse()
                .map(applicant,ApplicantResponse.class);
        return applicantResponse;

    }

    @GetMapping
    public List<Applicant> getAllApplicants(){
        return applicantService.getAllApplicants();
    }



}
