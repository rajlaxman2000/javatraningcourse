package com.student.frontlayer;

import java.util.List;
import java.util.Scanner;

import com.student.display.BranchDisplay;
import com.student.display.ParentDisplay;
import com.student.display.StudentDisplay;
import com.student.dto.Parent;
import com.student.dto.SchoolBranch;
import com.student.dto.Student;
import com.student.service.BranchService;
import com.student.service.ParentService;
import com.student.service.StudentService;
import com.student.service.impl.BranchServiceImpl;
import com.student.service.impl.ParentServiceImpl;
import com.student.service.impl.StudentServiceImpl;


public class Menu {

	int i=0;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		Menu menu = new Menu();
		menu.mainMenu();
	}
	
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
		case 1: branchMenu();
		break;
		case 2: studentMenu();
				break;
		case 3: parentMenu();
				break;
		default:
			break;
		
		}
	}
	
	
	public void branchMenu(){
		do{
		System.out.println();
		System.out.println("1.Display all the Branches list");
		System.out.println("2.Retreive a Branch details by entering branch ID");
		System.out.println("3.Update Branch Details");//only phone number changes
		System.out.println("4.Insert Branch Details by ID ");
		System.out.println("5.Delete Branch Details by ID");
		System.out.println("0:Exit to homescreen");
		System.out.print("\nPlease enter your Choice: ");
		BranchService branchService = new BranchServiceImpl();
		BranchDisplay display = new BranchDisplay();
		int id;
		String ph;
		i = sc.nextInt();
				switch (i) {
		//Retrieve ALL
		case 1:
			List<SchoolBranch> branchList = branchService.getBranchDetails();
			display.retreiveAll(branchList);
			break;
		//Retrieve by ID	
		case 2:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			SchoolBranch branch = branchService.getBranchById(id);
			display.showBranch(branch);
			break;
		//UPDATE	
		case 3:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			System.out.print("Enter new phone number:");
			ph = sc.next();
			branch = new SchoolBranch(id, ph);
			int updBranch = branchService.updateBranchById(branch);
			display.rowsEffected(updBranch);
			break;
		//INSERT	
		case 4:
			System.out.print("Enter branch ID: ");
			id = sc.nextInt();
			System.out.println("Enter branch Phone: ");
			ph = sc.next();
			branch = new SchoolBranch(id, ph);
			int insBranch = branchService.insertBranch(branch);
			display.rowsEffected(insBranch);
			break;
		//DELETE	
		case 5:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			int delBranch = branchService.deleteBranch(id);
			display.rowsEffected(delBranch);
			break;
		}
		}while(i!=0);
		Menu menu = new Menu();
		menu.mainMenu();
	}
	
	
	
	public void studentMenu(){
		do{
		System.out.println();
		System.out.println("1.Display all the students list");
		System.out.println("2.Retreive a Student details by entering student name");
		System.out.println("3.Retreive a Student details by entering student ID");
		System.out.println("4.Update Student Details");
		System.out.println("5.Insert Student Details");
		System.out.println("6.Delete existing Student Details by entering student name");
		System.out.println("7.Delete existing Student Details by entering student ID");
		System.out.println("0:Exit to homescreen");
		System.out.print("\nPlease enter your Choice: ");
		StudentService studentService = new StudentServiceImpl();
		
		i = sc.nextInt();
		switch(i) {
		case 1:
			List<Student> studentlist = studentService.getAllStudents();
			StudentDisplay.displayStudents(studentlist);
			break;
		case 2:
			System.out.println("Enter student name you want to search");
			String name = sc.next();
			Student student = studentService.getStudentByName(name);
			StudentDisplay.displayStudent(student);
			break;
		case 3:
			System.out.println("Enter student ID you want to search");
			int id = sc.nextInt();
			student = studentService.getStudentById(id);
			StudentDisplay.displayStudent(student);
			break;
		case 4:
			System.out.println("Enter the student values that you want to update");
			System.out.println("Enter student ID: ");
			id = sc.nextInt();
			System.out.println("Enter student name: ");
			name = sc.next();
			System.out.println("Enter student branch ID: ");
			int branchid = sc.nextInt();
			student = new Student(id,name,branchid);
			boolean result = studentService.updateStudent(student);
			System.out.println("student row updated: "+result);
			break;
		case 5:
			System.out.println("Enter the student values that you want to insert");
			System.out.println("Enter student name: ");
			name = sc.next();
			System.out.println("Enter student branch ID: ");
			branchid = sc.nextInt();
			student = new Student(name,branchid);
			int index = studentService.insertStudent(student);
			System.out.println("student inserted at: "+index+" row");
			break;
		case 6:
			System.out.println("Enter student name that you want to delete");
			name = sc.next();
			result = studentService.deleteStudentByName(name);
			System.out.println("student row deleted: "+result);
			break;
		case 7:
			System.out.println("Enter student ID that you want to delete");
			id = sc.nextInt();
			result = studentService.deleteStudentById(id);
			System.out.println("student row deleted: "+result);
			break;
		case 0:
			mainMenu();
			break;
		default:
			System.out.println("Invalid entry");
		}
		}while(i!=0);
	}
	
	
	public void parentMenu(){
		do{
		System.out.println();
		System.out.println("1.Display the Parents list");
		System.out.println("2.Retreive a Parent details by entering student ID");
		System.out.println("3.Insert Parent Details by ID ");
		System.out.println("4.Delete Parent Details by StudentID ");
		System.out.println("0:Exit to homescreen");
		System.out.print("\nPlease enter your Choice: ");
		ParentService parentService = new ParentServiceImpl();
		ParentDisplay display = new ParentDisplay();
		int id,sid;
		String name;
		i = sc.nextInt();
				switch (i) {
		//RETRIEVE AL;		
		case 1:
			List<Parent> parentList = parentService.getParentDetails();
			display.retreiveAll(parentList);
			break;
		//RETRIEVE BY STUDENT ID	
		case 2:
			System.out.println("Enter student ID:");
			id = sc.nextInt();
			Parent parent = parentService.getParentById(id);
			display.showParent(parent);
			break;
		//INSERT PARENT DETAILS	
		case 3:
			System.out.println("Enter Parent Name: ");
			name = sc.next();
			System.out.print("Enter Student ID:");
			sid = sc.nextInt();
			parent = new Parent(name, sid);
			int insParent = parentService.insertParent(parent);
			display.insert(insParent);
			break;
		case 4:
			System.out.print("Enter Student ID:");
			id = sc.nextInt();
			int delParent = parentService.delParentByStudID(id);
			display.insert(delParent);
			break;
		}
		}while(i!=0);
		Menu menu = new Menu();
		menu.mainMenu();
	}
	
	
}
