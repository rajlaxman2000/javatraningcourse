package miniProject.dao;

import java.util.List;

import miniProject.dto.Student;

public interface StudentDAO {
	
	public Student getStudentByName(String name);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();
	
	public int insertStudent(Student student);
	
	
	public int updateStudent(Student student);
	
	public int deleteStudentByName(String name);
	
	public int deleteStudentById(int id);
	
	

}
