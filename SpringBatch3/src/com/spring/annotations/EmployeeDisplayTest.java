package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDisplayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring-beans-annotations.xml");
		
			//EmployeeDisplay empDisplay = 	(EmployeeDisplay)applicationContext.getBean("employeeDisplay");
		EmployeeJ250Display empDisplay = 	(EmployeeJ250Display)applicationContext.getBean("employeeDisplay");
			
				empDisplay.process();
				
				
	}

}
