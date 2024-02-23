package com.tobeto.bootcamproject.service.employee;

import com.tobeto.bootcamproject.model.dto.employee.request.EmployeeUpdateRequest;
import com.tobeto.bootcamproject.model.entities.Employee;

public interface EmployeeUpdateService {
    Employee update(
            final Integer employeeId,
            final EmployeeUpdateRequest employeeUpdateRequest
    );
}
