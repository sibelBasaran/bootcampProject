package com.tobeto.bootcamproject.service.employee.impl;

import com.tobeto.bootcamproject.model.entities.Employee;
import com.tobeto.bootcamproject.repository.EmployeeRepository;
import com.tobeto.bootcamproject.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee getById(
            Integer employeeId
    )    {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye uygun Employee bulunamadı."));

    }
}
