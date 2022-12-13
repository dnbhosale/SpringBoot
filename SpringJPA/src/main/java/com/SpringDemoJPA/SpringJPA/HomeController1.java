package com.SpringDemoJPA.SpringJPA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HomeController1 {
	
	 

	@RequestMapping(value="/home1" )
	@ResponseBody
	public String msg() {
		
		return "Spring Boot";
	}

}
