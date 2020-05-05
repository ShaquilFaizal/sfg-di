package com.shaquilfaizal.sfgdi.controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;

public class PropertyInjectionController {

	public GreetingService greetingService;
	
	public String getGreeting() {
	   return greetingService.sayGreeting();	
	}
}
