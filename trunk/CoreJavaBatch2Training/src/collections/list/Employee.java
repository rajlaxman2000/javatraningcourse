package collections.list;

public class Employee implements Comparable<Employee>{
	
	
	
	private String name;
	
	private int age;

	private int empId;
	
	
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
	
	
	public boolean equals(Object object){
		Employee emp = (Employee) object;
		if(this.getEmpId() == emp.getEmpId() && this.getName().equals(emp.getName()) && this.age == emp.getAge()){
			return true;
		}
		return false;
	}
	
	public int hashCode(){
		return this.getEmpId()+this.getName().hashCode()+this.getAge();
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



	@Override
	public int compareTo(Employee emp) {
		if(this.empId < emp.getEmpId()){
			return -1;
		}else if(this.empId > emp.getEmpId()){
			return 1;
		}
		return 0;
	}

	

}
