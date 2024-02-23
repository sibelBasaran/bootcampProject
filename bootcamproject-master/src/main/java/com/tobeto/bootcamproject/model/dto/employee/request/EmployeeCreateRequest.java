package com.tobeto.bootcamproject.model.dto.employee.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class EmployeeCreateRequest extends UserCreateRequest {
    private String position;
}
