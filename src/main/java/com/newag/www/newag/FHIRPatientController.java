package com.newag.www.newag;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FHIRPatientController {
	
	@RequestMapping(value="/")
	public String home() {
		return "index";
	}
}
