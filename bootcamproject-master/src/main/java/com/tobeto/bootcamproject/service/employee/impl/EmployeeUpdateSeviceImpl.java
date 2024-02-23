package com.tobeto.bootcamproject.service.employee.impl;

import com.tobeto.bootcamproject.model.dto.employee.request.EmployeeUpdateRequest;
import com.tobeto.bootcamproject.model.entities.Employee;
import com.tobeto.bootcamproject.repository.EmployeeRepository;
import com.tobeto.bootcamproject.service.employee.EmployeeUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeUpdateSeviceImpl implements EmployeeUpdateService {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee update(
            final Integer employeeId,
            final EmployeeUpdateRequest employeeUpdateRequest
    ) {
        final Employee employeeEntityToBeUpdate = employeeRepository
                .findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip Employee bulunamadı."));

        employeeEntityToBeUpdate.setUserName(employeeUpdateRequest.getUserName());
        employeeEntityToBeUpdate.setFirstName(employeeUpdateRequest.getFirstName());
        employeeEntityToBeUpdate.setLastName(employeeUpdateRequest.getLastName());
        employeeEntityToBeUpdate.setDateOfBirthday(employeeUpdateRequest.getDateOfBirthday());
        employeeEntityToBeUpdate.setNationalIdentity(employeeUpdateRequest.getNationalIdentity());
        employeeEntityToBeUpdate.setEmail(employeeUpdateRequest.getEmail());
        employeeEntityToBeUpdate.setPassword(employeeUpdateRequest.getPassword());
        employeeEntityToBeUpdate.setPosition(employeeUpdateRequest.getPosition());

        return employeeRepository.save(employeeEntityToBeUpdate);
    }
}
