package com.tobeto.bootcamproject.service.applicant;

import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamproject.model.entities.Applicant;

public interface ApplicantCreateService {
    Applicant create(
            final ApplicantCreateRequest applicantCreateRequest
    );
}
