package com.jdbc.statments;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jdbc.framework.GenericDAO;


public class TestConnectionByFrameWork extends GenericDAO {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
	
		TestConnectionByFrameWork connectionByFrameWork = new TestConnectionByFrameWork();
		
		connectionByFrameWork.startProcess();
	}
	
	
	public void startProcess(){	
		
		
		PreparedStatement preparedStatement 	= null;		
		ResultSet rs							= null;
		
		try {
		
		connection   = getConnection();
		
		// Data base query
		String sql = "SELECT id, name, age FROM employee where id=? or name=?";
		
		//Step4: Create statement from connection object to play with quaries
		preparedStatement =connection.prepareStatement(sql);	
	
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Harsha21");	
		//Step5: Execution the query
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
