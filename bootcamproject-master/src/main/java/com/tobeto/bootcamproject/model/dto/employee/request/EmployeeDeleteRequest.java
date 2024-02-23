package com.tobeto.bootcamproject.model.dto.employee.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserDeleteRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDeleteRequest extends UserDeleteRequest {
    private String position;
}
