package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TwoWheeler implements Vehicle, ApplicationContextAware {

	private String type;
	
	private String brand;
	
	private ApplicationContext context;
	
	public TwoWheeler(){
		
	}
	
	public void initMethod(){
		System.out.println("TWO wheeeler init method is begin called");
	}
	
	public void destMethod(){
		System.out.println("TWO wheeeler destroy method is begin called");
	}
	
	
	/**
	 * @param type
	 * @param brand
	 */
	public TwoWheeler(String type, String brand) {
		this.type = type;
		this.brand = brand;
		System.out.println("TWO whleer object is created");
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
		
		Vehicle vehicle  = (ThreeWhleer)context.getBean("vehicle3.bean");
		
		vehicle.serviceVehicle();
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
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		context = applicationContext;
	}






}
