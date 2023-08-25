package com.stackroute.wiprosample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Samplecontroller {
	
	@GetMapping("/home")
	public ResponseEntity getHome()
	{
		return new ResponseEntity("Welcome to AI programming",HttpStatus.OK);
	}

}
