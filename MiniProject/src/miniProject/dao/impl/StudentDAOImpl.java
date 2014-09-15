package miniProject.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
				branchLoc = rs.getInt("branchLocation");
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
				branchLoc = rs.getInt("branchLocation");
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
			
			preparedStatement =  getConnection().prepareStatement(sql);
			rs = preparedStatement.executeQuery(sql);
			while (rs.next()) {
				id = rs.getInt("studentID");
				studentName = rs.getString("studentName");
				branchLoc = rs.getInt("branchLocation");
				student = new Student(id,studentName,branchLoc);
				students.add(student);
			}
				
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException se) {
			// TODO: handle exception
		}finally{
			closeThings(preparedStatement,rs);
		}	
		return students;
	}

	public int insertStudent(Student student) {
		int studentID = student.getStudentID();
		String name = student.getName();
		int branchLoc = student.getBranchLocation();
		String sql = "insert into student values(?,?,?)";
		int newRowIndex =0;
		try{
		
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, studentID);
			preparedStatement.setString(2,name);
			preparedStatement.setInt(3, branchLoc);
		
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

	public boolean updateStudent(Student student) {
		int stuID = student.getStudentID();
		String stuname = student.getName();
		int branchloc = student.getBranchLocation();
		boolean result = false;
		String sql = "update student set ?,?,? where studentID=?";
		try{
			
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, stuID);
			preparedStatement.setString(2,stuname);
			preparedStatement.setInt(3, branchloc);
			preparedStatement.setInt(4, stuID);
			result = preparedStatement.execute();
			
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

	public boolean deleteStudentByName(String name) {
		String stuname = name;
		String sql = "delete from student where name=?";
		boolean result = false;
		try{
			
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setString(1,stuname);
			result = preparedStatement.execute();
			
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

	public boolean deleteStudentById(int id) {
		int stuid = id;
		String sql = "delete from student where studentID=?";
		boolean result = false;
		try{
			
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, stuid);
			result = preparedStatement.execute();
			
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
