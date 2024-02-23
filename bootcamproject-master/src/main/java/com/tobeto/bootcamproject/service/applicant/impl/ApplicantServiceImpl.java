package com.tobeto.bootcamproject.service.applicant.impl;

import com.tobeto.bootcamproject.repository.ApplicantRepository;
import com.tobeto.bootcamproject.model.entities.Applicant;
import com.tobeto.bootcamproject.service.applicant.ApplicantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicantServiceImpl implements ApplicantService {

    private final ApplicantRepository applicantRepository;
    @Override
    public Applicant getById(
            Integer applicantId
    ) {
        return applicantRepository.findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye sahip bir applicant bulunamadı.") );
    }

    @Override
    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }
}
