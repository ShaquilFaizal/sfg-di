package com.shaquilfaizal.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;

@Controller
public class ContructorInjectedController {

	//@Autowired not needed in constructor injection
	private final GreetingService greetingService;

	public ContructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
