package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	// create a method to accept the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String mainPage() {
		return "processForm";
	}
}

