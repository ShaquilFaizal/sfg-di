package com.shaquilfaizal.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shaquilfaizal.sfgdi.controller.SetterInjectedController;
import com.shaquilfaizal.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}