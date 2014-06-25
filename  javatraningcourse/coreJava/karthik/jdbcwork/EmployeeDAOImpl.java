package jdbcwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAOImpl extends GenericMySQLDAO implements EmployeeDAO {

	//ResultSet rs = null;

	@Override
	public int insertEmployee(Employee employee) {
		

		try {

			Connection connection = getConnection();

			statement = connection.createStatement();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into database.employee values(?,?,?,?)");
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setInt(4, (int)(employee.getSalary()));
			preparedStatement.executeUpdate();
			System.out.println("inserted successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return 0;
	}

	public List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		Employee employee;
		Statement statement = null;
		ResultSet rs = null;

		try {
			Connection connection = getConnection();

			statement = connection.createStatement();

			String sql = "SELECT id, first_name, last_name, salary FROM database.employee";
			rs = statement.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {

				employee = new Employee(rs.getInt("id"),
						rs.getString("first_name"), rs.getString("last_name"),
						rs.getInt("salary"));
				employees.add(employee);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				super.closeMethod(rs, statement);
			} catch (SQLException e) {
				System.out
						.println("There seems to be a probblem in closing the things in super class");
				e.printStackTrace();
			}
		}
		return employees;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		String fname=null;
		String lname=null;
		int empid=0;
		int sal=0;
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter id that u want to update");
		empid=sc2.nextInt();
		System.out.println("enter first name");
		fname=sc2.next();
		System.out.println("enter last name");
		lname=sc2.next();
		System.out.println("enter salary");
		sal=sc2.nextInt();
		
		try{
		Connection connection = getConnection();

		statement = connection.createStatement();
		
		statement.executeUpdate("UPDATE database.employee SET "
				+ "first_name='"+fname+"',"
						+ "last_name='"+lname+"',"
								+ "salary="+sal+" "
				+ "WHERE ID="+empid+" ");
		System.out.println("updated successfully");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
		
	
	}

}
