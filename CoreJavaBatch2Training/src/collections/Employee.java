package collections;

public class Employee {
	
	private int empId;
	
	private String name;
	
	private int age;
	
	
	public Employee(){
		
	}
	

	/**
	 * @param empId
	 * @param name
	 * @param age
	 */
	public Employee(int empId, String name, int age) {
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return "\nEmpId::"+empId+"; EmpName::"+name+";Emp Age:: "+age;
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
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
