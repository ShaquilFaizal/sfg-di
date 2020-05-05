package com.shaquilfaizal.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shaquilfaizal.sfgdi.controller.SetterInjectedController;
import com.shaquilfaizal.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}