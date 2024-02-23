package com.tobeto.bootcamproject.service.employee.impl;

import com.tobeto.bootcamproject.model.entities.Employee;
import com.tobeto.bootcamproject.repository.EmployeeRepository;
import com.tobeto.bootcamproject.service.employee.EmployeeDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {
    private final EmployeeRepository employeeRepository;
    @Override
    public void delete(
            final Integer employeeId
    ) {
        final Employee employeeToBeDelete = employeeRepository
                .findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip Employee bulunamadı"));
        employeeRepository.delete(employeeToBeDelete);
    }
}
