package com.vcube.simplehelloworldapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class Hellocontroller {
	
	@GetMapping("/hello")
	String hello() {
		return "Spring Boot is Damn Easy than Core Java";
	}

}
