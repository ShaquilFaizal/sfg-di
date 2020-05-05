package com.shaquilfaizal.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;


@Controller
public class PropertyInjectionController {

	@Autowired
	public GreetingService greetingService;
	
	
	public String getGreeting() {
	   return greetingService.sayGreeting();	
	}
}
