package com.cts.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.setName("John");
		System.out.println(userService.getName());
		
		UserService userService2 = context.getBean(UserService.class);
		System.out.println(userService2.getName()); //returns John if scope is default/singleton
		//returns null if scope is prototype as another bean will be created
	}
}
