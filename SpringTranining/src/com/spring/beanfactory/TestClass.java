package com.spring.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestClass {
	
	public static void main (String[] args){
		
		/*
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:/WorkSpace-personal/SpringTranining/resources/spring.xml"));
		
		Triangle triangle = (Triangle)factory.getBean("triangle");
		*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		triangle.draw();
	}

}
