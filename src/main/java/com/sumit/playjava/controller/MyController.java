package com.sumit.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test-docker")
	public String getDaString() {
		return "Bienvenue au premier projet de test Java.";
	}
}
