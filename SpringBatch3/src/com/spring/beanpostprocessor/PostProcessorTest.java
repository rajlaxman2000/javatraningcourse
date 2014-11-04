package com.spring.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 AbstractApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring-beans-postprocessor.xml");
		 
		 Employee employee = (Employee)applicationContext.getBean("employee");
		 	//System.out.println("Employee Oject::"+employee);
		 Student student = (Student)applicationContext.getBean("student");
			//System.out.println("Student Oject::"+student);
		
		 applicationContext.registerShutdownHook();
	}
}
