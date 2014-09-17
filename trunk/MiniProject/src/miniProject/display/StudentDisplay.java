package miniProject.display;

import java.util.List;

import miniProject.dto.Student;

public class StudentDisplay {
	
	public static void displayStudent(Student student){
		System.out.println("Student Display: "+student);
	}
	
	public static void displayStudents(List<Student> students){
		System.out.println("List of students: "+students);
		
	}

}
