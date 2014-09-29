package com.java.collections.map;

public class Address {
	
	private String drNo;
	
	private String StreetName;
	
	private String city;
	
	private String state;

	private String country;
	
	public Address(){
		
	}
	

	public Address(String drNo, String streetName, String city, String state, String country) {
		
		this.drNo = drNo;
		this.StreetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	/**
	 * @return the drNo
	 */
	public String getDrNo() {
		return drNo;
	}

	/**
	 * @param drNo the drNo to set
	 */
	public void setDrNo(String drNo) {
		this.drNo = drNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return StreetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
