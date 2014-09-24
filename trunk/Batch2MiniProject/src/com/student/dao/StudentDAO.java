package com.student.dao;

import java.util.List;

import com.student.dto.Student;

public interface StudentDAO {
	
	public Student getStudentByName(String name);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();
	
	public int insertStudent(Student student);
	
	
	public boolean updateStudent(Student student);
	
	public boolean deleteStudentByName(String name);
	
	public boolean deleteStudentById(int id);
	
	

}
