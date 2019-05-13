package com.newag.www.newag;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api2")
public class FHIRPatientController {
	
	private TerminRepository repository;
	
	@Autowired
	public FHIRPatientController(TerminRepository repository) {
		this.repository = repository;
	}
	
	@CrossOrigin
	@GetMapping("/termins")
	public Collection<Termin> termine(){
		return repository.findAll().stream()
				.filter(this::isPremium)
				.collect(Collectors.toList());
	}
	
	private boolean isPremium(Termin termin) {
		return !termin.getName().equals("Mike") && !termin.getName().equals("Alex");
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "index.html";
	}
}
