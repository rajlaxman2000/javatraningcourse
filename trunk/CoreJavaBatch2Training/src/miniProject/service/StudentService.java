package miniProject.service;

import java.util.List;

import miniProject.dto.Student;

public interface StudentService {
	
	public Student searchStudentByName(String name);
	
	public List<Student> getAllStudents();
	
	public int addStudent(Student student);
	
	public boolean updateStudent(Student student);
	
	public boolean deleteStudent(String name, int studentId);
	
	

}
