package com.newag.www.newag;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;

@Component
public class TerminCommandLineRunner implements CommandLineRunner {
	
	private final TerminRepository repository;

	public TerminCommandLineRunner(TerminRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Stream.of("Peter", "Mike", "Tom", "Jim", "Bob","Alex").forEach(name -> repository.save(new Termin(name)));
		repository.findAll().forEach(System.out::println);
	}
	

}
