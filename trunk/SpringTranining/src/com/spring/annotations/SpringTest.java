package com.spring.annotations;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	
	public static void main(String[] args){		
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-annotations.xml");
		
		
		SpringAnnotationService service = (SpringAnnotationService)applicationContext.getBean("annotation.service");
		// This needs to be used for component based annotation testing`
		//SpringComponentAnnotationService service = (SpringComponentAnnotationService)applicationContext.getBean("annotation.component.service");
		service.startProcess();		
		//applicationContext.destroy();;
		applicationContext.registerShutdownHook();
	}
	


	
	




}
