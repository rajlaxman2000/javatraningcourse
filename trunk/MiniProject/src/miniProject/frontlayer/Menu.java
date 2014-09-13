package miniProject.frontlayer;

import java.util.Scanner;

import miniProject.service.StudentService;
import miniProject.service.impl.StudentServiceImpl;

public class Menu {

	
	int i=0;
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu(){
		System.out.println("Welcome to the School website");
		System.out.println("\nSelect what type of information you want from the options below:");
		System.out.println("\n1.Branch Details");
		System.out.println("2.Student Details");
		System.out.println("3.Parent Details");
		System.out.println("4.Teacher Details");
		System.out.println("5.Class Details");
		System.out.print("\nPlease enter your Choice: ");		
		
		int i = sc.nextInt();
		switch(i){
		case 2: studentMenu();
				break;
		default:
			break;
		
		}
	}
	
	public void studentMenu(){
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
		StudentService studentService = new StudentServiceImpl();
		i = sc.nextInt();
		switch (i) {
		case 1:
			studentService.getAllStudents();
			
			break;
		case 2:
			studentService.searchStudentByName(name);
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
	
	
}
