package miniProject.service.impl;

import java.util.List;

import miniProject.dao.StudentDAO;
import miniProject.dao.impl.StudentDAOImpl;
import miniProject.dto.Student;
import miniProject.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	public StudentDAO studentDAO = new StudentDAOImpl();
	
	@Override
	public Student getStudentByName(String name) {
		Student student = studentDAO.getStudentByName(name);
		return student;
	}

	@Override
	public Student getStudentById(int id) {
		Student student = studentDAO.getStudentById(id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = studentDAO.getAllStudents();
		return students;
	}

	@Override
	public int insertStudent(Student student) {
		int index = studentDAO.insertStudent(student);
		return index;
	}
	
	@Override
	public int updateStudent(Student student) {
		int result = studentDAO.updateStudent(student);
		return result;
	}

	@Override
	public int deleteStudentByName(String name) {
		int result = studentDAO.deleteStudentByName(name);
		return result;
	}

	@Override
	public int deleteStudentById(int id) {
		int result = studentDAO.deleteStudentById(id);
		return result;
	}

}
