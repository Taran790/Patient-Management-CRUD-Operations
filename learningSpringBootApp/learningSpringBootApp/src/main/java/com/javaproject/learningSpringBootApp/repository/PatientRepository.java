package com.javaproject.learningSpringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaproject.learningSpringBootApp.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
