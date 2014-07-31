package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.web.bind.annotation.InitBinder;

public class FourWheeler implements Vehicle, InitializingBean, DisposableBean, BeanFactoryPostProcessor  {

	private String type;
	
	private String brand;
	
	public FourWheeler(){
		
	}
	
	/**
	 * @param type
	 * @param brand
	 */
	public FourWheeler(String type, String brand) {
		System.out.println("Four whleer object is created");
		this.type = type;
		this.brand = brand;
	}

	@Override
	public void vehicleType() {
		System.out.println("Vehicle Type::" + getType());

	}

	@Override
	public void vehicleBrand() {
		System.out.println("Vehicle Brand::" + getBrand());

	}

	@Override
	public void serviceVehicle() {
		System.out.println("Vehicle servicing is completed");

	}
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("This method is postProcessAfterInitialization");
		System.out.println("Object details ::"+arg0);
		System.out.println("String details ::"+arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("This method is postProcessBeforeInitialization");
		System.out.println("Object details ::"+bean);
		System.out.println("String details ::"+beanName);
		return bean;
	}
*/
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
		System.out.println("I amgetting called from postProcessBeanFactory after bean created ");
	//	factory.getBean(paramClass);
	}
	
}
