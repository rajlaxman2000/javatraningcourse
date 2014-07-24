package com.spring.beans;

public class TwoWheeler implements Vehicle {

	private String type;
	
	private String brand;
	
	public TwoWheeler(){
		
	}
	
	
	
	/**
	 * @param type
	 * @param brand
	 */
	public TwoWheeler(String type, String brand) {
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



}
