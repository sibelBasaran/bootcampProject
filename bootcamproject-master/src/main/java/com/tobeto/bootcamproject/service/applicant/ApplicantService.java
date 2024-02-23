package com.tobeto.bootcamproject.service.applicant;

import com.tobeto.bootcamproject.model.entities.Applicant;

import java.util.List;

public interface ApplicantService {
    Applicant getById(final Integer applicantId);

    List<Applicant> getAllApplicants();
}
