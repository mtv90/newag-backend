package com.newag.www.newag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	
}
