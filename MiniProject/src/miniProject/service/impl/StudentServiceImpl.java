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
	public boolean updateStudent(Student student) {
		boolean result = studentDAO.updateStudent(student);
		return result;
	}

	@Override
	public boolean deleteStudentByName(String name) {
		boolean result = studentDAO.deleteStudentByName(name);
		return result;
	}

	@Override
	public boolean deleteStudentById(int id) {
		boolean result = studentDAO.deleteStudentById(id);
		return result;
	}

}
