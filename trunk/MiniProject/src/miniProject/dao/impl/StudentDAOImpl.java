package miniProject.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import miniProject.dao.StudentDAO;
import miniProject.dto.Student;
import miniProject.framework.Dbconnection;

public class StudentDAOImpl extends Dbconnection implements StudentDAO {
	
	PreparedStatement preparedStatement=null;	
	Statement statement = null;	
	ResultSet rs		= null;
	
	private int id=0;
	private String studentName=null;
	private int  branchLoc=0;

	/**
	 * student	
	 */
	public Student getStudentByName(String name) {
		
		Student student=null;
		
		String sql = "SELECT * FROM student where studentName=?";
		
		try{
		
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setString(1, name);
			rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				id = rs.getInt("studentID");
				studentName = rs.getString("studentName");
				branchLoc = rs.getInt("branchLoc");
			}
			student = new Student(id,studentName,branchLoc);
			
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closeThings(preparedStatement,rs);
		}
		return student;
		}

	
	public Student getStudentById(int id) {
		
		String sql = "SELECT * FROM student where studentID=?";
		Student student=null;
		try{
		
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, id);
			rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				id = rs.getInt("studentID");
				studentName = rs.getString("studentName");
				branchLoc = rs.getInt("branchLoc");
			}
			student = new Student(id,studentName,branchLoc);
			
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closeThings(preparedStatement,rs);
		}
		return student;
	}

	
	public List<Student> getAllStudents() {
		Student student=null;
		String sql ="select * from student";
		List<Student> students = new ArrayList<Student>();
		try{
			
			statement =  getConnection().createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				id = rs.getInt("studentID");
				studentName = rs.getString("studentName");
				branchLoc = rs.getInt("branchLoc");
				student = new Student(id,studentName,branchLoc);
				students.add(student);
			}
				
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closeThings(statement,rs);
		}	
		return students;
	}

	public int insertStudent(Student student) {
		String name = student.getStudentName();
		int branchLoc = student.getBranchLoc();
		String sql = "insert into student(studentName,branchLoc) values(?,?)";
		int newRowIndex = 0;
		try{
		
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setString(1,name);
			preparedStatement.setInt(2, branchLoc);
		
			newRowIndex = preparedStatement.executeUpdate();
			
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closePrepared(preparedStatement);
		}
		return newRowIndex;
		
	}

	
	
	
	public int updateStudent(Student student) {
		int stuID = student.getStudentID();
		String stuname = student.getStudentName();
		int branchloc = student.getBranchLoc();
		int result = 0;
		String sql = "update student set studentName=?,branchLoc=? where studentID=?";
		try{
			
			preparedStatement =  getConnection().prepareStatement(sql);
			//preparedStatement.setInt(1, stuID);
			preparedStatement.setString(1,stuname);
			preparedStatement.setInt(2, branchloc);
			preparedStatement.setInt(3, stuID);
			result = preparedStatement.executeUpdate();
			
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closePrepared(preparedStatement);
		}
		return result;
	}

	public int deleteStudentByName(String name) {
		String stuname = name;
		String sql = "delete from student where studentName=?";
		int result = 0;
		try{
			
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setString(1,stuname);
			result = preparedStatement.executeUpdate();
			
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closePrepared(preparedStatement);
		}
		return result;
	}

	public int deleteStudentById(int id) {
		int stuid = id;
		String sql = "delete from student where studentID=?";
		int result = 0;
		try{
			
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, stuid);
			result = preparedStatement.executeUpdate();
			
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closePrepared(preparedStatement);
		}
		return result;
	}




}
