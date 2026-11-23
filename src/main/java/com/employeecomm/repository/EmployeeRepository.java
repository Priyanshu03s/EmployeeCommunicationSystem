package com.employeecomm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeecomm.entity.Employee;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, String> {

    boolean existsByEmployeeId(String employeeId);

    boolean existsByEmail(String email);

    Optional<Employee> findByEmail(String email);

    Optional<Employee> findByEmployeeId(String employeeId);
}
