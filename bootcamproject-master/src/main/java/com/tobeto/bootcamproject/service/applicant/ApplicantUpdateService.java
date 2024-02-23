package com.tobeto.bootcamproject.service.applicant;

import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcamproject.model.entities.Applicant;

public interface ApplicantUpdateService {
    Applicant update(
            final Integer applicantId,
            final ApplicantUpdateRequest applicantUpdateRequest
    );

}
