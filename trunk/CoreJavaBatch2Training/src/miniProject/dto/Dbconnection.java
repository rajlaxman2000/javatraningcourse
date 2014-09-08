package miniProject.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Dbconnection {
public static Connection connection	= null;
	
	private final static String DB_URL =  "jdbc:mysql://localhost/test";
	
	private final static String USER = "root";
	
	private final static String PASS= "";
	
	private final static String driverName = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName(driverName);
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		return  connection;
	}
	
	public void closeThingsResultset(ResultSet resultSet){
		try{
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void closeThingsStatement(Statement statement){
		try{
			statement.close();
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
