package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring-beans-autowire.xml");
		
			Employee emp1 = 	(Employee)applicationContext.getBean("employee1");
		
			System.out.println(emp1);
			

			Employee emp2 = 	(Employee)applicationContext.getBean("employee2");
		
			System.out.println(emp2);
			
			
			
	}

}
