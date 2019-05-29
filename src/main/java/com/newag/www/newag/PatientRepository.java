package com.newag.www.newag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PatientRepository extends JpaRepository<Patient, Long> {

	Patient save(Patient patient);
}
