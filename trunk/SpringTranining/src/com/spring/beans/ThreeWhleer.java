package com.spring.beans;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ThreeWhleer implements Vehicle, InitializingBean, DisposableBean{
	
	private String type;
	
	private String brand;
	
	private List<String> owners; 
	
	
	public ThreeWhleer(){
		
	}
	
	
	/**
	 * @return the owners
	 */
	public List<String> getOwners() {
		return owners;
	}


	/**
	 * @param owners the owners to set
	 */
	public void setOwners(List<String> owners) {
		this.owners = owners;
	}


	/**
	 * @param type
	 * @param brand
	 */
	public ThreeWhleer(String type, String brand) {
		this.type = type;
		this.brand = brand;
		this.owners = getOwners();
		System.out.println("Three whleer object is created\n");
		System.out.println("OWNERS LIST"+owners);
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
		System.out.println("OWNERS LIST"+owners);

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
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am getting called after seetin of properties");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("This will be called when this bean is gettign distroyed");
		
	}
	
	

}
