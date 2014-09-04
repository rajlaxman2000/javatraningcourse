package com.jdbc.farmework;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class GenericDAO {
	
	public static Connection connection	= null;
	
	final static String DB_URL =  "jdbc:mysql://localhost/test";
	
	final static String USER = "root";
	
	final static String PASS= "";
	
	final static String driverName = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName(driverName);
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		return  connection;
	}
	
	public void closeThings(PreparedStatement preparedStatement, ResultSet resultSet){
		try{
			preparedStatement.close();
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public void closeThings(Statement statement, ResultSet resultSet){
		try{
			statement.close();
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public void closeThings(CallableStatement callableStatement, ResultSet resultSet){
		try{
			callableStatement.close();
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	

}
