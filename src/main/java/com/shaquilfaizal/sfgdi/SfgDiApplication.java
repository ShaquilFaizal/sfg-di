package com.shaquilfaizal.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.shaquilfaizal.sfgdi.controller.ContructorInjectedController;
import com.shaquilfaizal.sfgdi.controller.MyController;
import com.shaquilfaizal.sfgdi.controller.PropertyInjectionController;
import com.shaquilfaizal.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
		
		System.out.println("-----------Property");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());
		
		System.out.println("---------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("---------------Constructor");
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	
	}
}
