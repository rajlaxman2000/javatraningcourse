package miniProject.dao;

import java.util.List;

import miniProject.dto.Student;

public interface StudentDAO {
	
	public Student getStudentByName(String name);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();
	
	public int insertStudent(Student student);
	
	public boolean updateStudent(Student studnet);
	
	public boolean deleteStudentByName(String name);
	
	public boolean deleteStudentById(int id);
	
	

}
