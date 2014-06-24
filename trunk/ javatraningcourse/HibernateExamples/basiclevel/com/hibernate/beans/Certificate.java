package com.hibernate.beans;

public class Certificate {
	
	private int id;
	private String name;
	
	/**
	 * Default constructor, this i mandatory for Hibernate to treat this class a persistent class 
	 */
	public Certificate() {
		
	} 
	
	public Certificate(String name) { 
		this.name = name; 
	}
	
	public boolean equals(Object obj){
		// If object is empty
		if(obj == null)
			return false;
		// If both objects are not of same class 
		System.out.println(this.getClass());
		if(!this.getClass().equals(obj.getClass()))
			return false;
		
		Certificate certificate = (Certificate)obj; 
		// Treating object as equal if they have same id and name
		if( (this.id == certificate.getId()) && (this.name.equals(certificate.getName()))) {
			return true; 
		}
		
		return false;
	}
	
	public int hashCode(){
		return (id+name).hashCode();
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
