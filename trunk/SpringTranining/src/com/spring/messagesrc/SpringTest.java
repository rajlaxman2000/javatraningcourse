package com.spring.messagesrc;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	
	public static void main(String[] args){		
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-msgsrc.xml");
		
		
		SpringMsgSrcService service = (SpringMsgSrcService)applicationContext.getBean("lifecycle.service");
		
		service.startProcess();		
		//applicationContext.destroy();;
		applicationContext.registerShutdownHook();
	}
	


	
	




}
