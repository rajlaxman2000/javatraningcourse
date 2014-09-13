package miniProject.test;

import java.util.Scanner;

import miniProject.dao.impl.StudentDAOImpl;

public class StudentDetails extends StudentDAOImpl{

	int i=0;
	StudentDetails sd = new StudentDetails();
	Scanner sc = new Scanner(System.in);
	
	public void studentPage(){
		System.out.println();
		System.out.println("1.Displya all the students list");
		System.out.println("2.Retreive a Student details by entering student name");
		System.out.println("3.Retreive a Student details by entering student ID");
		System.out.println("4.Update Student Details");
		System.out.println("5.Insert Student Details");
		System.out.println("6.Delete existing Student Details by entering student name");
		System.out.println("7.Delete existing Student Details by entering student ID");
		System.out.println("8:Exit to previous Menu");
		System.out.println("0:Exit to homescreen");
		
		i = sc.nextInt();
		switch (i) {
		case 1:
			sd.retreiveAll();
			break;
		case 2:
			sd.retreiveByName();
			break;
		case 3:
			sd.retreiveById();
			break;
		case 4:
			sd.update();
			break;
		case 5:
			sd.insert();
			break;
		case 6:
			sd.deleteByName();
			break;
		case 7:
			sd.deleteByID();
			break;
		case 8:
			sd.studentPage();
			break;
		case 0:
			ProjectTest test = new ProjectTest();
			test.homescreen();
			break;
		}
	}
	void retreiveAll(){
		System.out.println("\nList of students: ");
		sd.getAllStudents();
	}
	void retreiveByName(){
		System.out.println("\nEnter the name of the student");
		String name = sc.next();
		System.out.println("Given Student details: ");
		sd.getStudentByName(name);
	}
	void retreiveById(){
		System.out.println("\nEnter the ID of the student");
		int id = sc.nextInt();
		System.out.println("Given Student details: ");
		sd.getStudentById(id);
	}
	void update(){
		System.out.println("\nEnter the student details that you want to update");
	}
	void insert(){
		System.out.println("\nEnter a new student details");
	}
	void deleteByName(){
		System.out.println("\nEnter the student name that you want to delete");
	}
	void deleteByID(){
		System.out.println("\nEnter the student ID that you want to delete");
	}
	
}
