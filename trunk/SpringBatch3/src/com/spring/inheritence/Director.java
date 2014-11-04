package com.spring.inheritence;

public class Director {
	
	private int id;
	
	private int age;
	
	private String name;
	
	private String designation;
	
	private String previlages;
	
	
	public Director(){
		
	}
	public String toString(){
		return "Director Id::"+id+"; Director Name::"+name+"; Director Age::"+age+"; Director designation ::"+designation+"; Director previlages:: "+previlages;
	}

	public Director(int id, String name, int age, String designation,String previlages) {	
		this.id = id;	
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.previlages = previlages;
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the previlages
	 */
	public String getPrevilages() {
		return previlages;
	}

	/**
	 * @param previlages the previlages to set
	 */
	public void setPrevilages(String previlages) {
		this.previlages = previlages;
	}
	

}
