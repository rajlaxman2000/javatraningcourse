package com.spring.messagesrc;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	
	public static void main(String[] args){		
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-msgsrc.xml");
		
		
		SpringMsgSrcService service = (SpringMsgSrcService)applicationContext.getBean("propertyfiles.service");
		
		
		service.startProcess();		
		//applicationContext.destroy();;
		
		System.out.println(applicationContext.getMessage("testmsg", null, "This is default test message", null));
		applicationContext.registerShutdownHook();
	}
	


	
	




}
