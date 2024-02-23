package com.tobeto.bootcamproject.model.dto.applicant.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class ApplicantCreateRequest extends UserCreateRequest {
    private String about;
}
