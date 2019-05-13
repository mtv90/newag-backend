package com.newag.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FhirPatientController {

	@GetMapping("/test")
	public String getPatients() {
		
		String name = "Hier werden die Patienten vom FHIR-Server dargestellt";
		return name;	
	}
}
