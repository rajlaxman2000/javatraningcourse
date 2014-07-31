package com.spring.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	
	public static void main(String[] args){		
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-lifecycle.xml");
		
		
		SpringLifeCycleService service = (SpringLifeCycleService)applicationContext.getBean("lifecycle.service");
		
		service.startProcess();		
		//applicationContext.destroy();;
		applicationContext.registerShutdownHook();
	}
	


	
	




}
