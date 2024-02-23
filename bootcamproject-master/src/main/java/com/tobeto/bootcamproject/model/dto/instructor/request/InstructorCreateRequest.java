package com.tobeto.bootcamproject.model.dto.instructor.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class InstructorCreateRequest extends UserCreateRequest {

    private String companyName;
}
