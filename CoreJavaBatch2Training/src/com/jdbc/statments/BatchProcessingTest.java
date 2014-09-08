package com.jdbc.statments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.farmework.GenericDAO;

public class BatchProcessingTest extends GenericDAO {

	PreparedStatement preparedStatement=null;	
	Statement statement = null;	
	ResultSet rs		= null;
	Connection connection = null;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BatchProcessingTest test = new BatchProcessingTest();

	}
	
	public void startBatchProcessing(){
		
		String sql = "Insert into employee (empName, position, saalary) values (?,?,?)";
		
		try{
		
			connection = getConnection();
			
			connection.setAutoCommit(false);
			
			preparedStatement =  connection.prepareStatement(sql);
			
				preparedStatement.setString(1, "Raghu");
				preparedStatement.setString(2, "Software Engineer");
				preparedStatement.setDouble(3, 10000);
				
			preparedStatement.addBatch();
			
				preparedStatement.setString(1, "Ramaesh");
				preparedStatement.setString(2, "Technical Architect");
				preparedStatement.setDouble(3, 90000);
			preparedStatement.addBatch();
		
			int[] count = preparedStatement.executeBatch();
				
			connection.commit();	
				
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}finally{
			closeThings(preparedStatement);
		}
	}
	
	

}
