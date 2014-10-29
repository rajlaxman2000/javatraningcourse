package com.hibernate.association.Many2Many;

import java.util.Set;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	private Set<Certificate> certificates; 

	public Employee() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param salary
	 * @param address
	 */
	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;		

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the certificates
	 */
	public Set<Certificate> getCertificates() {
		return certificates;
	}

	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}
	
	

}
