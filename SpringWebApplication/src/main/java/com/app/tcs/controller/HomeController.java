package com.app.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/showHomePage")
	public String showForm(){
		
		return "home";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){		
		return "showpage";
	}

}
