package com.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 AbstractApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring-beans-scope.xml");
		
			/*
			Employee emp1 = 	(Employee)applicationContext.getBean("employee");
		
			//System.out.println(emp1);
			
			Employee emp2 = 	(Employee)applicationContext.getBean("employee");
			
			//System.out.println(emp2);
			
			*/

			Student std1 = 	(Student)applicationContext.getBean("student");
		
			//System.out.println(std1);
			
			
			//Student std2 = 	(Student)applicationContext.getBean("student");
			
			//System.out.println(std2);
			
			//Student std3 = 	(Student)applicationContext.getBean("student");
			
			System.out.println("Test");
			
			applicationContext.registerShutdownHook();
			
	}

}
