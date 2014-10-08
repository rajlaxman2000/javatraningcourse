package com.jdbc.statments;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PrepareCallStatmentTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
		/// user name = root, psd = ""
		
		
		Connection connection					= null;
		CallableStatement callableStatement 	= null;		
		ResultSet rs							= null;
		
		try {
		
		//Step1 :  register the driver class	
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step2 : declare the connection url and username and pass word
		String DB_URL =  "jdbc:mysql://localhost/test";
		
		String USER = "root";
		
		String PASS= "";
		
		
		
		//Step3 :  Create connection from DriverManegr with connection url and username and pass word
		
		/*
		 * This is to pass the url and user name and pass word individually
		 */
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		// Let us select all the records and display them.
	     String sql = "{call getEmpName (?,?)}";
		
		//Step4: Create statement from connection object to play with quaries
	     callableStatement = connection.prepareCall(sql);
	
	     callableStatement.setInt(1, 4);
	     // Because second parameter is OUT so register it
	     callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR); 
				
	     //Use execute method to run stored procedure.
	      System.out.println("Executing stored procedure..." );
	      
	      callableStatement.execute();

	      //Retrieve employee name with getXXX method
	      String empName = callableStatement.getString(2);
	      
	      System.out.println("Employee name for given employee id is ::"+empName);
		
		}catch(ClassNotFoundException notFoundException){
			
			notFoundException.printStackTrace();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{			
			try {
				// STEP 6: Clean-up environment
				//rs.close();
				callableStatement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
