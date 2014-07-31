package com.spring.lifecycle;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentBean implements InitializingBean, DisposableBean {
	
	private int id;
	
	private String name;
	
	private String age;
	
	private Date dob;
	
	public StudentBean(){
		System.out.println("Student bean constructor called");
	}
	
	public StudentBean(int id, String name, String age, Date dob){
		
		this.id = id;		
		this.name= name;
		this.age = age;
		this.dob = dob;
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

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	/**
	 * This method will be called after the bean created (i.e after constructor) 
	 *  
	 */
	public void afterPropertiesSet() throws Exception {	
		System.out.println("Student bean afterPropertiesSet method ");
	}
	
	/**
	 * This method will be called based on config of individual bean init tag
	 */
	public void customInit(){
		System.out.println("Student bean cutom init method like afterPropertiesSet method");
	}
	
	@Override
	/**
	 * This method will be called before bean is about to get destroyed
	 */
	public void destroy() throws Exception {
		System.out.println("Student bean destroy method ");
		
	}
	
	/**
	 * This method will be called based on config of individual bean destroy tag
	 */
	public void customDestroy()  {
		System.out.println("Student bean cutom destroy method like afterPropertiesSet method");
		
	}
	


	
	

}
