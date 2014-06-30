package interfaceinheritence;

public class Employee {
	
	private int empId;
	
	private int empAge;
	
	private String empName;
	
	private int salary;

	
	
	public Employee(int empId, int empAge, String empName, int salary) {		
		this.empId = empId;
		this.empAge = empAge;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String toString(){
		
		return "Emp Id::"+empId+"; Emp Age::"+empAge+"; Emp Name::"+empName+"; Emp Salary::"+salary;
		
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
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}

	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}	

}
