package com.tobeto.bootcamproject.service.applicant.impl;

import com.tobeto.bootcamproject.core.mapper.ModelMapperService;
import com.tobeto.bootcamproject.repository.ApplicantRepository;
import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcamproject.model.entities.Applicant;
import com.tobeto.bootcamproject.service.applicant.ApplicantUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantUpdateServiceImpl implements ApplicantUpdateService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Applicant update(
            final Integer applicantId,
            final ApplicantUpdateRequest applicantUpdateRequest
    ) {
        final Applicant applicantEntityToBeUpdate = applicantRepository
                .findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip bir Applicant bulunamadı."));

        applicantEntityToBeUpdate.setUserName(applicantUpdateRequest.getUserName());
        applicantEntityToBeUpdate.setFirstName(applicantUpdateRequest.getFirstName());
        applicantEntityToBeUpdate.setLastName(applicantUpdateRequest.getLastName());
        applicantEntityToBeUpdate.setDateOfBirthday(applicantUpdateRequest.getDateOfBirthday());
        applicantEntityToBeUpdate.setNationalIdentity(applicantUpdateRequest.getNationalIdentity());
        applicantEntityToBeUpdate.setEmail(applicantUpdateRequest.getEmail());
        applicantEntityToBeUpdate.setPassword(applicantUpdateRequest.getPassword());
        applicantEntityToBeUpdate.setAbout(applicantUpdateRequest.getAbout());

        return applicantRepository.save(applicantEntityToBeUpdate);
    }
}
