package com.lko.EveryNeed.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	
	@RequestMapping(value ="/register")
	public String showSignup()
	{
		return "Registration";
	}

}
