package com.tobeto.bootcamproject.model.dto.employee.request;

import com.tobeto.bootcamproject.model.dto.user.request.UserUpdateRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeUpdateRequest extends UserUpdateRequest {
    private String position;
}
