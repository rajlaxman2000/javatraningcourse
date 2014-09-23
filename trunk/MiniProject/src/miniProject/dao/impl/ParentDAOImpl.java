package miniProject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import miniProject.dao.ParentDAO;
import miniProject.dto.Parent;
import miniProject.dto.SchoolBranch;
import miniProject.framework.Dbconnection;

public class ParentDAOImpl extends Dbconnection implements ParentDAO{

	Connection conn = null;
	Statement statement = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public List<Parent> getParentDetails() {
		List<Parent> parentList = new ArrayList<Parent>();
		Parent parent = null;
		String sql = "SELECT * FROM parent";
		
		try{		
			conn = getConnection();
			statement =  conn.createStatement();
			
			rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				int parentID = rs.getInt("parentID");
				String parentName = rs.getString("parentName");
				int studentID = rs.getInt("stud_ID");
				String parentPhone = rs.getString("parentPhone");
				
				parent = new Parent(parentID, parentName, studentID, parentPhone);
				parentList.add(parent);
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closeThings(statement,rs);
		}

		return parentList;
	}

	@Override
	public Parent getParentById(int id) {
		Parent parent = null;
		String sql = "SELECT * FROM parent where stud_ID = ?";
		
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			ps.setInt(1, id);
			//rs = statement.executeQuery(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int parentID = rs.getInt("parentID");
				String parentName = rs.getString("parentName");
				int studentID = rs.getInt("stud_ID");
				String parentPhone = rs.getString("parentPhone");
				
				parent = new Parent(parentID, parentName, studentID, parentPhone); 
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closeThings(ps,rs);
		}


		return parent;
	}

	@Override
	public int insertParent(Parent parent) {
		//Scanner s = new Scanner(System.in);
		String name = parent.getParentName();
		int sid = parent.getStud_ID();
		String phone = parent.getParentPhone();
		
		String sql = "INSERT INTO parent(parentName,stud_ID,parentPhone) VALUES (?,?,?)";
		int numOfRowsChanged = 0;
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			//System.out.println("Enter Parent Name: ");
			ps.setString(1,name);
			//System.out.print("Enter Student ID:");
			ps.setInt(2,sid);
			ps.setString(3, phone);
			
			numOfRowsChanged = ps.executeUpdate();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closePrepared(ps);
		}

		return numOfRowsChanged;
	}
	
	
	
	@Override
	public int updateParent(Parent parent) {
		//Scanner s = new Scanner(System.in);
		//String name = parent.getParentName();
		int sid = parent.getStud_ID();
		String phone = parent.getParentPhone();
		
		String sql = "UPDATE parent SET parentPhone = ? WHERE stud_ID = ?";
		int numOfRowsChanged = 0;
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			//System.out.println("Enter Parent Name: ");
			ps.setString(1,phone);
			//System.out.print("Enter Student ID:");
			ps.setInt(2,sid);
			
			numOfRowsChanged = ps.executeUpdate();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closePrepared(ps);
		}

		return numOfRowsChanged;
	}
	
	public int delParentByStudID(int id) {
		String sql = "DELETE FROM parent WHERE stud_ID = ?";
		int numOfRowsChanged = 0;
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			//System.out.print("Enter Parent ID: ");
			ps.setInt(1,id);
			
			numOfRowsChanged = ps.executeUpdate();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closePrepared(ps);
		}

		return numOfRowsChanged;
	}


}
