package jdbcpractise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.sql.PreparedStatement;

public class EmployeeDAOImpl extends GenericMySQLDAO implements EmployeeDAO {

	ResultSet rs=null;
	
	@Override
	public int insertEmployee(Employee employee) throws SQLException {
		Connection connection= getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter FName");
		String first_name=sc.next();
		System.out.println("Enter LName");
		String last_name=sc.next();
		System.out.println("Enter SAL");
		int sal=sc.nextInt();
		try{
		String sql = "insert into sunny.employee values(?,?,?,?)";
		PreparedStatement ps= connection.prepareStatement(sql);
		ps.setInt(1,id);
		ps.setString(2, first_name);
		ps.setString(3, last_name);
		ps.setFloat(4, sal);
		ps.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
	System.out.println(e);
		}
		return 0;
	}

	public List<Employee> getEmployees() {
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee;
		Statement statement=null;
		ResultSet rs=null;
		
		try {
			Connection connection = getConnection();
			
			statement = connection.createStatement();

			String sql = "SELECT id, first_name, last_name, salary FROM sunny.employee";
			rs = statement.executeQuery(sql);
			
			// STEP 5: Extract data from result set
			while (rs.next()) {
								
				employee = new Employee(rs.getInt("id"), 
								rs.getString("first_name"), 
								rs.getString("last_name"), 
								rs.getInt("salary")); 
				employees.add(employee);
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				super.closeMethod(rs, statement);
			} catch (SQLException e) {
				System.out.println("There seems to be a probblem in closing the things in super class");
				e.printStackTrace();
			}
		}
		return employees;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		System.out.println("Enter Modified Fname:");
		String fname=sc.next();
		System.out.println("Enter modified Lname:");
		String lname=sc.next();
		System.out.println("Enter modified salary:");
		int salary=sc.nextInt();
		try{
	    String sql="UPDATE sunny.employee SET first_name='"+fname+"',last_name='"+lname+"',salary='"+salary+"' WHERE id='"+id+"'";
		PreparedStatement ps= connection.prepareStatement(sql);
		ps.executeUpdate();
		System.out.println("Executed successfully!!!!");
		}catch(Exception e){
			System.out.println(e);
		}		
		return null;
	}

}

		
		/*System.out.println("Enter ID:");
		employee.setEmpId(sc.nextInt());
		System.out.println("Enter Modified Fname:");
        employee.setFirstName(sc.next());
		System.out.println("Enter modified Lname:");
		employee.setLastName(sc.next());
		System.out.println("Enter modified salary:");
		employee.setSalary(sc.nextInt());
		
		try{
	    String sql="UPDATE sunny.employee SET first_name='"+employee.getFirstName()+"',last_name='"+employee.getLastName()+"',salary='"+employee.getSalary()+"' WHERE id='"+employee.getEmpId()+"'";
		PreparedStatement ps= connection.prepareStatement(sql);
		ps.executeUpdate();
		System.out.println("Executed successfully!!!!");
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}

}*/
