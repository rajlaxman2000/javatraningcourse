package com.spring.beantest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class VehicleTest {
	
	public static void main(String[] args){		
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-postProcessor.xml");
		//AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-factoryPostProcessor.xml");
		
		//AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-autowire.xml");
		
		VehicleService service = (VehicleService)applicationContext.getBean("vehile.service");
		
		service.startProcess();		
		//applicationContext.destroy();;
		applicationContext.registerShutdownHook();
		
		//VehicleService service1 = new VehicleService();
		
		
		
	}
	


	
	




}
