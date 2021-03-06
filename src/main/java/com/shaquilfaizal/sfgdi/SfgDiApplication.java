package com.shaquilfaizal.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.shaquilfaizal.sfgdi.controller.ContructorInjectedController;
import com.shaquilfaizal.sfgdi.controller.I18NController;
import com.shaquilfaizal.sfgdi.controller.MyController;
import com.shaquilfaizal.sfgdi.controller.PropertyInjectionController;
import com.shaquilfaizal.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18NController i18NController  = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());
		
		
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------------- Primary Bean");
		System.out.println(myController.sayHello());
		
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
