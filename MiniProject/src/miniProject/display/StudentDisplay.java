package miniProject.display;

import java.util.List;

import miniProject.dto.Student;

public class StudentDisplay {
	
	public static void displayStudent(Student student){
		student.toString();
	}
	
	public static void displayStudents(List<Student> students){
		System.out.println("List of students: ");
		Student student= null;
		for(int i=0;i<students.size();i++){
			student = students.get(i);
			student.toString();
			
		}
	}

}
