package com.shaquilfaizal.sfgdi.controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;

public class ContructorInjectedController {

	private final GreetingService greetingService;

	public ContructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
