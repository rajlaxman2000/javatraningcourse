package miniProject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import miniProject.dao.BranchDAO;
import miniProject.dto.SchoolBranch;
import miniProject.framework.Dbconnection;

public class BranchDAOImpl extends Dbconnection implements BranchDAO{

	Connection conn = null;
	Statement statement = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public List<SchoolBranch> getBranchDetails() {
		
		List<SchoolBranch> branchList = new ArrayList<SchoolBranch>();
		SchoolBranch branch = null;
		String sql = "SELECT * FROM schoolbranch";
		
		try{		
			conn = getConnection();
			statement =  conn.createStatement();
			
			rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				int branchLoc = rs.getInt("branchLocation");
				String branchPhone = rs.getString("branchPhone");
				
				branch = new SchoolBranch(branchLoc, branchPhone); 
				branchList.add(branch);
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closeThings(statement,rs);
		}
		
		return branchList;
	}

	@Override
	public SchoolBranch getBranchById(int id) {
		
		SchoolBranch branch = null;
		String sql = "SELECT * FROM schoolbranch where branchLocation = ?";
		
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			ps.setInt(1, id);
			//rs = statement.executeQuery(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int branchLoc = rs.getInt("branchLocation");
				String branchPhone = rs.getString("branchPhone");
				
				branch = new SchoolBranch(branchLoc, branchPhone); 
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally{
			closeConn(conn);
			closeThings(ps,rs);
		}

		return branch;
	}

	@Override
	public int updateBranchById(SchoolBranch branch) {
		//Scanner s = new Scanner(System.in);
		String ph = branch.getBranchPhone();
		int id = branch.getBranchLocation();
		String sql = "UPDATE schoolbranch SET branchPhone = ? WHERE branchLocation = ?";
		int numOfRowsChanged = 0;
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			//System.out.print("Enter new phone number:");
			ps.setString(1, ph);
			ps.setInt(2, id);
			
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
	public int insertBranch(SchoolBranch  branch) {
		int id = branch.getBranchLocation();
		String ph = branch.getBranchPhone();
		String sql = "INSERT INTO schoolbranch(branchLocation,branchPhone) VALUES (?,?)";
		int numOfRowsChanged = 0;
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			//System.out.print("Enter branch ID: ");
			ps.setInt(1, id);
			//System.out.println("Enter branch Phone: ");
			ps.setString(2, ph);
			
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
	public int deleteBranch(int id) {
		
		String sql = "DELETE FROM schoolbranch WHERE branchLocation = ?";
		int numOfRowsChanged = 0;
		try{		
			conn = getConnection();
			ps =  conn.prepareStatement(sql);
			ps.setInt(1, id);
			
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
