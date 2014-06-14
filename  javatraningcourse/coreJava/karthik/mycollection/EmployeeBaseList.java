package mycollection;

public class EmployeeBaseList implements Comparable<EmployeeBaseList> {

	private int empId;
	private int empSalary;
	private String empName;
	private String branch;

	public String toString() {
		return "Id:: " + empId + "; salary:: " + empSalary + "; Name:: "
				+ empName + "branch ::" + branch;
	}

	public int compareTo(EmployeeBaseList emp) {
		int ead = this.empId - emp.getEmpId();
		if (ead > 0) {
			return 1;
		} else if (ead < 0) {
			return -1;
		} else
			return 0;
	}

	public EmployeeBaseList()

	{
	}

	public EmployeeBaseList(int empId,int empSalary,String empName,String branch)

{
	this.empId=empId;
	this.empSalary=empSalary;
	this.empName=empName;
	this.branch=branch;
			
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
