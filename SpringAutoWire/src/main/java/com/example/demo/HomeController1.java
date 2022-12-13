package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController1 {
	
	@RequestMapping("/home")
	public String msg() {
		
		System.out.println("Spring boot app");
		
		return "Spring Boot Application";
	}

}
