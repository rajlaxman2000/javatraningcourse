package interfaceRefExamples;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IEmployee employeeImpl = new HREmployeeImpl();
		
		IEmployee employeeImpl2 = new ITEmployeeImpl();
		
		IEmployee iEmployee;
		
		
		iEmployee = employeeImpl;
		
		iEmployee = employeeImpl2;

	}

}
