package com.spring.beantest;

import com.spring.beans.FourWheeler;
import com.spring.beans.ThreeWhleer;
import com.spring.beans.Vehicle;

public class VehicleService {
	
	private Vehicle vehicle1;
	
	private Vehicle vehicle2;
	
	
	private String companyName;
	
	private Integer value;
	
	private String name;
	
	

	
	/**
	 * @param companyName
	 * @param value
	 * @param valid
	 */
	
	public VehicleService(String companyName, Integer value, boolean valid) {
		this.companyName = companyName;
		this.value = value;
		this.valid = valid;
	}
	

	private boolean valid;
	
	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}


	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}


	public VehicleService() {
		System.out.println("My object is getting created");
	}


	public void startProcess(){
		
		//System.out.println(getName());
		
		System.out.println("Service Center Name ::  "+getCompanyName());
		
		System.out.println("Service value  ::  "+getValue());
		
		System.out.println("Service isValid  ::  "+isValid());
		
		vehicle1.vehicleType();
		vehicle1.vehicleBrand();
		vehicle1.serviceVehicle();
		
		
		vehicle2.vehicleType();
		vehicle2.vehicleBrand();
		vehicle2.serviceVehicle();
		
	}

	

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}


	


	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}


	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	public Vehicle getVehicle1() {
		return vehicle1;
	}


	public void setVehicle1(Vehicle vehicle1) {
		this.vehicle1 = vehicle1;
	}


	public Vehicle getVehicle2() {
		return vehicle2;
	}


	public void setVehicle2(Vehicle vehicle2) {
		this.vehicle2 = vehicle2;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	
}
