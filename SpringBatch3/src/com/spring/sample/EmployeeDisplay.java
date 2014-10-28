package com.spring.sample;

public class EmployeeDisplay {
	
	private Employee emp1;
	
	private Employee emp2;
	
	public EmployeeDisplay(){
		
	}
	
	public void process(){
		
		System.out.println("Employee 1 Details :: \n");
			System.out.println(emp1);
		System.out.println("Employee 2 Details :: \n");
			System.out.println(emp2);
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

	
	

}
