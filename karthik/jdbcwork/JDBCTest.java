package jdbcwork;

import java.util.Scanner;

public class JDBCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ch;
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		//EmployeeDAOImpl daoImpl= new EmployeeDAOImpl();
		System.out.println("MENU");
		System.out.println("1.GET DETAILS");
		System.out.println("2.INSERT DETAILS");
		System.out.println("3.UPDATE DATA");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println(employeeDAO.getEmployees());
			break;
		case 2:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter id");
			int id = sc1.nextInt();
			System.out.println("enter first name");
			String first_name = sc1.next();
			System.out.println("enter last name");
			String last_name = sc1.next();
			System.out.println("enter salary");
			int salary = sc1.nextInt();
			employeeDAO.insertEmployee(new Employee(id,first_name,last_name,salary));
			break;
		case 3:
			
			
			employeeDAO.updateEmployee(new Employee());
			break;

		}
			

	}

}
