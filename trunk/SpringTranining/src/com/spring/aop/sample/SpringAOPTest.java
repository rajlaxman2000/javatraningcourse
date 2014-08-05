package com.spring.aop.sample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAOPTest {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-aopsample.xml");

		SpringAOPService service = (SpringAOPService) applicationContext.getBean("aoptest.service");

		service.startProcess();
	
		applicationContext.registerShutdownHook();
	}
}