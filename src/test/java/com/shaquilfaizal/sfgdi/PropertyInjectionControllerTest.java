package com.shaquilfaizal.sfgdi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shaquilfaizal.sfgdi.controller.PropertyInjectionController;
import com.shaquilfaizal.sfgdi.services.ConstructorGreetingService;

class PropertyInjectionControllerTest {

	PropertyInjectionController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectionController();
		
		controller.greetingService = new ConstructorGreetingService(); 
			
	}
	
	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
