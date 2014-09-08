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
	Student student = new Student();
		
	public Student getStudentByName(String name) {
		
		
		
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
		return (Student) student;
		}

	@Override
	public Student getStudentById(int stuid) {
		
		String sql = "SELECT * FROM student where studentID=?";
		
		try{
		
			preparedStatement =  getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, stuid);
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
		return (Student) student;
	}

	@Override
	public List<Student> getAllStudents() {
		
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

	@Override
	public int insertStudent(Student student) {
		
		return 0;
	}

	@Override
	public boolean updateStudent(Student studnet) {
		
		return false;
	}

	@Override
	public boolean deleteStudentByName(String name) {
		
		return false;
	}

	@Override
	public boolean deleteStudentById(int id) {
		
		return false;
	}

}
