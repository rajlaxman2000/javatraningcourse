package com.spring.beantest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class VehicleTest {
	
	public static void main(String[] args){		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		VehicleService service = (VehicleService)applicationContext.getBean("vehile.service");
		
		service.startProcess();
		
		//VehicleService service1 = new VehicleService();
		
		
		
	}
	


	
	




}
