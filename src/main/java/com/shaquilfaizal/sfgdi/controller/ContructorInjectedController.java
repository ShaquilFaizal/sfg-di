package com.shaquilfaizal.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.shaquilfaizal.sfgdi.services.GreetingService;

@Controller
public class ContructorInjectedController {

	//@Autowired not needed in constructor injection
	private final GreetingService greetingService;

	//@Qualifer("the bean name") if we don't use the qualifier this will call the @primary 
	public ContructorInjectedController( @Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
