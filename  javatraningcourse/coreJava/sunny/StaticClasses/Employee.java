package StaticClasses;


public class Employee {
	public int empId;
	public String empName;
	
	public void Employee(int id,String name){
		this.empId=id;
		this.empName=name;
		System.out.println("empid:"+empId);
		System.out.println("empname:"+empName);
}
}
