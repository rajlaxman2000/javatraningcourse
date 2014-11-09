package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDisplayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring-beans-autowire.xml");
		
			EmployeeDisplay empDisplay = 	(EmployeeDisplay)applicationContext.getBean("employeeDisplay");
			
				empDisplay.process();
				
				
	}

}
