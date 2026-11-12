package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String getMessage() {
		System.out.println("*********");
		System.out.println("___________");
		return "Hi demo";
	}
	
	@GetMapping("/msg")
	public String getMsg() {
		
		return "Hi msg";
	}
}
