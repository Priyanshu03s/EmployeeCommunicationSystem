package com.employeecomm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeecomm.entity.PendingRegistration;

@Repository
public interface PendingRegistrationRepository
        extends JpaRepository<PendingRegistration, String> {

    boolean existsByEmployeeId(String employeeId);

    boolean existsByEmail(String email);

    Optional<PendingRegistration> findByEmployeeId(String employeeId);

    Optional<PendingRegistration> findByEmail(String email);

    void deleteByEmployeeId(String employeeId);

    void deleteByEmail(String email);
}

