package com.sumit.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Comment
@RestController
public class MyController {
	
	@GetMapping("/test-docker")
	public String getDaString() {
		return "Bienvenue au premier projet de test Java.";
	}
	@GetMapping("/test-docker1")
	public String getDataString() {
		return "Encore bienvenue au premier projet de test Java.";
	}
	@GetMapping("/test-docker2")
	public String getDataString1() {
		return "Enfin bienvenue au premier projet de test Java.";
	}
	@GetMapping("/test-docker3")
	public String getDataString2() {
		return "Et après bienvenue au premier projet de test Java pipeline.";
	}
}
