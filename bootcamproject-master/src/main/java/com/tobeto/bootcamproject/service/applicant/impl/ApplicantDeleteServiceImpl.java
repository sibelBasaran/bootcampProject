package com.tobeto.bootcamproject.service.applicant.impl;

import com.tobeto.bootcamproject.repository.ApplicantRepository;
import com.tobeto.bootcamproject.model.entities.Applicant;
import com.tobeto.bootcamproject.service.applicant.ApplicantDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantDeleteServiceImpl implements ApplicantDeleteService {

    private final ApplicantRepository applicantRepository;

    @Override
    public void delete(
            final Integer applicantId
    )
    {
        final Applicant applicantEntityToBeDelete = applicantRepository
                .findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip bir Applicant bulunamadı."));

        applicantRepository.delete(applicantEntityToBeDelete);
    }
}
