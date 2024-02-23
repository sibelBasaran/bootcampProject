package com.tobeto.bootcamproject.model.dto.applicant.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserDeleteRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantDeleteRequest extends UserDeleteRequest {
    private String about;
}
