package com.jdbc.transactions;

public class Employee {	
	
	private int empId;
	private String name;
	private String age;	
	private String doj;
	
	public String toString(){
		return "EmpId::"+empId+"; Name::"+name+"; Age::"+age+"; DOJ::"+doj+"\n";
	}
	
	public Employee(){
		
	}
	
	public Employee(int empId, String name, String age, String doj) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.doj = doj;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
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
	 * @return the doj
	 */
	public String getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
	
	}
