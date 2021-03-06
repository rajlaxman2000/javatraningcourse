package com.spring.beans;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


public class FourWheeler implements Vehicle, InitializingBean, DisposableBean {

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

	
}
