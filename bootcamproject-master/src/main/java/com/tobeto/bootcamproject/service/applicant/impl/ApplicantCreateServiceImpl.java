package com.tobeto.bootcamproject.service.applicant.impl;

import com.tobeto.bootcamproject.core.mapper.ModelMapperService;
import com.tobeto.bootcamproject.repository.ApplicantRepository;
import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamproject.model.entities.Applicant;
import com.tobeto.bootcamproject.service.applicant.ApplicantCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ApplicantCreateServiceImpl implements ApplicantCreateService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public Applicant create(
            final ApplicantCreateRequest applicantCreateRequest)
    {
        final Applicant applicantToBeSave = modelMapperService.forRequest()
                .map(applicantCreateRequest, Applicant.class);

        return applicantRepository.save(applicantToBeSave);
    }
}
