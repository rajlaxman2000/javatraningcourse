package com.java.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;

public class TestConnection {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
		/// user name = root, psd = ""
		
		
		Connection connection	= null;
		Statement statement 	= null;
		PreparedStatement preparedStatement = null;
		ResultSet rs			= null;;
		
		try {
		
		//Step1 :  register the driver class	
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step2 : declare the connection url and username and pass word
		String DB_URL =  "jdbc:mysql://localhost/test";
		
		String USER = "root";
		
		String PASS= "";
		
		String DB_Complete_URL =  DB_URL+"?user="+USER+"&password="+PASS;
		
		//jdbc:mysql://localhost/test?user=root&password=
		System.out.println(DB_Complete_URL);
		
		//Step3 :  Create connection from DriverManegr with connnection url and username and pass word
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		// way-2 : Another way of creating the connection by using driver manager
		//Connection connection = DriverManager.getConnection(DB_Complete_URL);
		
		//Way-3: Creating connection using properties object.
		Properties properties = new Properties();
		// you can use put also
		properties.setProperty("user", USER);
		properties.setProperty("password", PASS);
		
		//connection = DriverManager.getConnection(DB_URL,properties);
		
		
		//Step4: Create statement from connection object to play with quaries
		statement = connection.createStatement();
		
		
		// Data base query
		String sql = "SELECT id, name, age FROM employee";
		
		rs = statement.executeQuery(sql);
		

		
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
		
		
		}catch(ClassNotFoundException notFoundException){
			
			notFoundException.printStackTrace();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				try {
					// STEP 6: Clean-up environment
					rs.close();
					statement.close();
					connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		}
		
		
		

	}

}
