package com.shaquilfaizal.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	@Autowired
	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
