package com.spring.annotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeJ250Display {
	
	/*
	@Autowired
	@Qualifier("employee1")
	 */
	@Resource(name="employee1")
	private Employee emp1;
	
	@Resource(name="emp2")
	private Employee emp2;
	
	@Resource(name="student")
	private Student student;
	
	
	
	public EmployeeJ250Display(){
		
	}
	
	public void process(){
		
		System.out.println("Employee 1 Details :: \n");
			System.out.println(emp1);
		System.out.println("Employee 2 Details :: \n");
			System.out.println(emp2);
			
		System.out.println("Student Details :: \n");
			System.out.println(student);
	}

	/**
	 * @return the emp1
	 */
	public Employee getEmp1() {
		return emp1;
	}

	/**
	 * @param emp1 the emp1 to set
	 */
	public void setEmp1(Employee emp1) {
		this.emp1 = emp1;
	}

	/**
	 * @return the emp2
	 */
	public Employee getEmp2() {
		return emp2;
	}

	/**
	 * @param emp2 the emp2 to set
	 */		
	public void setEmp2(Employee emp2) {
		this.emp2 = emp2;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	
	

}
