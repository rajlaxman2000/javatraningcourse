package com.jdbc.statments;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.jdbc.farmework.GenericDAO;



public class PreparedStatmentDAOImplTest extends GenericDAO {

	PreparedStatement preparedStatement=null;	
	Statement statement = null;	
	ResultSet rs		= null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		PreparedStatmentDAOImplTest preparedStatmentDAOImplTest  = new PreparedStatmentDAOImplTest();
		
		preparedStatmentDAOImplTest.getEmployeeDetails();
		

	}

	public void getEmployeeDetails(){
		
		
		String sql = "SELECT id, name, age FROM employee where name=? and age=?";
		
		try{
		
			preparedStatement =  getConnection().prepareStatement(sql);
				preparedStatement.setString(1, "Raghu");
				preparedStatement.setInt(2, 30);
				
			rs = preparedStatement.executeQuery();
				
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int  age = rs.getInt("age");
				
				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print(", Age: " + age);			
				System.out.println("\n");					
			}
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closeThings(preparedStatement,rs);
		}
		
		
		
		
		
	}

}
