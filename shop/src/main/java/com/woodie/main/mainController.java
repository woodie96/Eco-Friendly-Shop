package com.woodie.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
}
