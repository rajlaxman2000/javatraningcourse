package com.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessorEx implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException {
		System.out.println("This is BeforeInitialization method with bean name:: "+beanName);
		return beanObj;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException {
		System.out.println("This is AfterInitialization method with bean name:: "+beanName);
		return beanObj;
	}

	

}
