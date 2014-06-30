package interfaceinheritence;

public class FinancialTeamEmployees extends GenericEmployee {

	@Override
	public String getEmployeePrevilage(int empId) {
		
		return "Financial team can access any employee salary";
	}

}
