package com.tobeto.bootcamproject.model.dto.applicant.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserUpdateRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantUpdateRequest extends UserUpdateRequest {
    private String about;
}
