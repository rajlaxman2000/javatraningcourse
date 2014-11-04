package com.spring.inheritence;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 AbstractApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring-beans-inheritence.xml");
		 
		 Employee employee = (Employee)applicationContext.getBean("employee");
		 	System.out.println("Employee Oject::"+employee);
		Director director = (Director) applicationContext.getBean("director");
		System.out.println("Director Oject::"+director);
		
		 applicationContext.registerShutdownHook();
	}
}
