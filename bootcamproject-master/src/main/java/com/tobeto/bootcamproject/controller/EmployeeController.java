package com.tobeto.bootcamproject.controller;

import com.tobeto.bootcamproject.model.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcamproject.model.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcamproject.model.dto.employee.request.EmployeeUpdateRequest;
import com.tobeto.bootcamproject.model.entities.Employee;
import com.tobeto.bootcamproject.service.employee.EmployeeCreateService;
import com.tobeto.bootcamproject.service.employee.EmployeeDeleteService;
import com.tobeto.bootcamproject.service.employee.EmployeeUpdateService;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeCreateService employeeCreateService;
    private final EmployeeDeleteService employeeDeleteService;
    private final EmployeeUpdateService employeeUpdateService;

    @PostMapping
    public Employee createEmployee(
            @RequestBody final EmployeeCreateRequest employeeCreateRequest
    ) {
        final Employee createdEmployee = employeeCreateService.create(employeeCreateRequest);
        return createdEmployee;

    }

    @PutMapping("/{employeeId}")
    public Employee updateEmployeeById(
            @PathVariable("employeeId") final Integer employeeId,
            @RequestBody final EmployeeUpdateRequest employeeUpdateRequest
    )
    {
        final Employee updatedEmployee = employeeUpdateService
                .update(employeeId,employeeUpdateRequest);

        return updatedEmployee;
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(
            @PathVariable("employeeId") final Integer employeeId
    ){
        employeeDeleteService.delete(employeeId);
    }
}
