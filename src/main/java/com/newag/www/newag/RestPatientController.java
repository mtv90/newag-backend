package com.newag.www.newag;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class RestPatientController {

	@Autowired
	private AppointmentRepository appRepo;
	
	@Autowired
	private PatientRepository patRepo;
	
	@RequestMapping(path = "/api/appointments", method = RequestMethod.POST)
	public ResponseEntity<?> postAppointment(@RequestBody Appointment appointment){
		
		long id = appointment.getPatient().getId();
		Patient pat = patRepo.findOne(id);
		Date start = appointment.getStart();
		System.out.println(start);
		appointment.setAppointments(pat);
		Appointment app = new Appointment(appointment.getTitle(), pat, start);
		appRepo.save(app);
		
		return new ResponseEntity<>(appRepo.findAll(), HttpStatus.CREATED);
	}
	
}
