package miniProject.frontlayer;

import java.util.List;
import java.util.Scanner;

import miniProject.display.BranchDisplay;
import miniProject.display.ParentDisplay;
import miniProject.dto.Parent;
import miniProject.dto.SchoolBranch;
import miniProject.service.BranchService;
import miniProject.service.ParentService;
import miniProject.service.impl.BranchServiceImpl;
import miniProject.service.impl.ParentServiceImpl;


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
		//case 2: studentMenu();
			//	break;
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
		BranchService branchService = new BranchServiceImpl();
		BranchDisplay display = new BranchDisplay();
		int id;
		i = sc.nextInt();
				switch (i) {
		case 1:
			List<SchoolBranch> branchList = branchService.getBranchDetails();
			display.retreiveAll(branchList);
			break;
		case 2:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			SchoolBranch branch = branchService.getBranchById(id);
			display.showBranch(branch);
			break;
		case 3:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			int updBranch = branchService.updateBranchById(id);
			display.insert(updBranch);
			break;
		case 4:
			int insBranch = branchService.insertBranch();
			display.insert(insBranch);
			break;
		case 5:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			int delBranch = branchService.deleteBranch(id);
			display.insert(delBranch);
			break;
		}
		}while(i!=0);
		Menu menu = new Menu();
		menu.mainMenu();
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
	
	
	public void parentMenu(){
		do{
		System.out.println();
		System.out.println("1.Display the Parents list");
		System.out.println("2.Retreive a Parent details by entering student ID");
		System.out.println("3.Insert Parent Details by ID ");
		System.out.println("0:Exit to homescreen");
		ParentService parentService = new ParentServiceImpl();
		ParentDisplay display = new ParentDisplay();
		int id;
		i = sc.nextInt();
				switch (i) {
		case 1:
			List<Parent> parentList = parentService.getParentDetails();
			display.retreiveAll(parentList);
			break;
		case 2:
			System.out.println("Enter branch ID:");
			id = sc.nextInt();
			Parent parent = parentService.getParentById(id);
			display.showParent(parent);
			break;
		case 3:
			int insParent = parentService.insertParent();
			display.insert(insParent);
			break;
		}
		}while(i!=0);
		Menu menu = new Menu();
		menu.mainMenu();
	}
	
	
}
