package interfaceinheritence;

public class HrEmployees extends GenericEmployee {

	
	
	@Override
	public String getEmployeePrevilage(int empId) {	
		return "Hr can access any employee details";
	}

}
