package com.pksg.gcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello There from GCP !!!!!";
	}

}
