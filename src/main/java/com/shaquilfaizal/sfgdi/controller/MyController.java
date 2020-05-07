package com.shaquilfaizal.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;

@Controller
public class MyController {

	
	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
