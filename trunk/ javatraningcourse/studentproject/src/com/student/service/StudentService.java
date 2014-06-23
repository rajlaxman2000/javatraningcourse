package com.student.service;

import com.student.dto.Student;

public interface StudentService {
	
	public int insertStudent(Student student);
	
	public boolean editStudent(Student student);
	
	public boolean deleteStudent(int studentId);
	
	public Student getStudentDetailsById(int studentId);
	
	public Student getStudentDetailsByName(String studentName);
	
	

}
