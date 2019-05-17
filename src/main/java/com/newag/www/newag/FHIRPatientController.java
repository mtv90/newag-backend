package com.newag.www.newag;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FHIRPatientController {
	
	private TerminRepository repository;
	
	@Autowired
	public FHIRPatientController(TerminRepository repository) {
		this.repository = repository;
	}
	
	@CrossOrigin
	@GetMapping("/termine")
	public Collection<Termin> termine(){
		return repository.findAll().stream()
				.collect(Collectors.toList());
	}

	
	@RequestMapping(value="/")
	public String index() {
		return "index.html";
	}
}
