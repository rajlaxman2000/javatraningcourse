package com.hibernate.annotationex;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;



@Entity(name="EMP_DETAILS")
public class Employee {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int id;
	
	@Column(name="first_name")
	private  String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private int salary;
	
	@Column(name="date_of_join")
	private Date doj;
	
	@Lob
	private String description;
	
	
	
	public Employee(){
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param salary
	 * @param certificates
	 */
	public Employee(String firstName, String lastName, int salary) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;	
		this.doj = new Date();
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param salary
	 * @param certificates
	 */
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;		
	}
	
	public String toString(){
		return "EmpId :: "+id+"; firstName:: "+firstName+" lastName:: "+"; salary:: "+salary;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
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
	 * @param lastName the lastName to set
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
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
