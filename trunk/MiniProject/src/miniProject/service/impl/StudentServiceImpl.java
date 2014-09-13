package miniProject.service.impl;

import java.util.List;

import miniProject.dao.StudentDAO;
import miniProject.dao.impl.StudentDAOImpl;
import miniProject.dto.Student;
import miniProject.service.StudentService;

public class StudentServiceImpl implements StudentService {

	public StudentDAO studentDAO = new StudentDAOImpl();
	
	public Student searchStudentByName(String name) {
		Student student = studentDAO.getStudentByName(name);
		return student;
	}

	public List<Student> getAllStudents() {
		List<Student> students = studentDAO.getAllStudents();
		return students;
	}

	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudent(String name, int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

}
