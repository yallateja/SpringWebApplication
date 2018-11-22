package com.app.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/showHomePage")
	public String showForm(ModelMap model){
		
		model.addAttribute("student", new Student());
		
		return "home";
	}
	
	@RequestMapping(value="/processStudent", method=RequestMethod.POST)
	public String processForm(@ModelAttribute Student student,ModelMap model){
		
				return "student_details";
	}

}
