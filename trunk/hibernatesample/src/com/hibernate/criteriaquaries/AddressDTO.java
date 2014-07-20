package com.hibernate.criteriaquaries;

public class AddressDTO {

	private String drNo;

	private String addline1;
	private String addline2;

	private String city;
	private String state;

	private String country;

	/**
	 * @return the drNo
	 */
	public String getDrNo() {
		return drNo;
	}

	/**
	 * @param drNo
	 *            the drNo to set
	 */
	public void setDrNo(String drNo) {
		this.drNo = drNo;
	}

	/**
	 * @return the addline1
	 */
	public String getAddline1() {
		return addline1;
	}

	/**
	 * @param addline1
	 *            the addline1 to set
	 */
	public void setAddline1(String addline1) {
		this.addline1 = addline1;
	}

	/**
	 * @return the addline2
	 */
	public String getAddline2() {
		return addline2;
	}

	/**
	 * @param addline2
	 *            the addline2 to set
	 */
	public void setAddline2(String addline2) {
		this.addline2 = addline2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
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
	 * @param state
	 *            the state to set
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
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
