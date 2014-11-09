package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class EmployeeDisplay {
	
	@Autowired
	@Qualifier("employee1")
	private Employee emp1;
	
	@Autowired	
	private Employee emp2;
	
	@Autowired
	private Student student;
	
	
	
	public EmployeeDisplay(){
		
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
