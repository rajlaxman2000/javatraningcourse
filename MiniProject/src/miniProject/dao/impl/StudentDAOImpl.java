package miniProject.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import miniProject.dao.StudentDAO;
import miniProject.dto.Dbconnection;
import miniProject.dto.Student;

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
			closeThingsStatement(preparedStatement);
			closeThingsResultset(rs);
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
			closeThingsStatement(preparedStatement);
			closeThingsResultset(rs);
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
			closeThingsStatement(preparedStatement);
			closeThingsResultset(rs);
		}	
		return students;
	}

	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean updateStudent(Student studnet) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudentByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return false;
	}




}
