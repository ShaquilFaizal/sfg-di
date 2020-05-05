package com.shaquilfaizal.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shaquilfaizal.sfgdi.controller.ContructorInjectedController;
import com.shaquilfaizal.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ContructorInjectedController Controller;

	@BeforeEach
	void setUp() throws Exception {
		Controller = new ContructorInjectedController(new GreetingServiceImpl());

	}

	@Test
	void testGetGreeting() {
		System.out.println(Controller.getGreeting());
	}

}
