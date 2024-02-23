package com.tobeto.bootcamproject.service.employee.impl;

import com.tobeto.bootcamproject.core.mapper.ModelMapperService;
import com.tobeto.bootcamproject.repository.EmployeeRepository;
import com.tobeto.bootcamproject.model.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcamproject.model.entities.Employee;
import com.tobeto.bootcamproject.service.employee.EmployeeCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeCreateServiceImpl implements EmployeeCreateService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Employee create(
            EmployeeCreateRequest employeeCreateRequest)
    {
        final Employee employeeToBeSave = modelMapperService.forRequest()
                .map(employeeCreateRequest,Employee.class);

        return employeeRepository.save(employeeToBeSave);
    }
}
