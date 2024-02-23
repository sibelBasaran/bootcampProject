package com.tobeto.bootcamproject.repository;


import com.tobeto.bootcamproject.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
