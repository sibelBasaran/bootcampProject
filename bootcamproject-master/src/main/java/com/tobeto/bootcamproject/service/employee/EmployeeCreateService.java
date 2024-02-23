package com.tobeto.bootcamproject.service.employee;

import com.tobeto.bootcamproject.model.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcamproject.model.entities.Employee;

public interface EmployeeCreateService {
    Employee create(
            final EmployeeCreateRequest employeeCreateRequest
    );
}
