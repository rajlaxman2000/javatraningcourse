package miniProject.frontlayer;

import java.util.Scanner;

public class ProjectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProjectTest projectTest = new ProjectTest();
		projectTest.homescreen();
	}
	void homescreen(){
		System.out.println("Welcome to the School website");
		System.out.println("\nSelect what type of information you want from the options below:");
		System.out.println("\n1.Branch Details");
		System.out.println("2.Student Details");
		System.out.println("3.Parent Details");
		System.out.println("4.Teacher Details");
		System.out.println("5.Class Details");
		System.out.print("\nPlease enter your Choice: ");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch(i){
		case 1: StudentDetails studentDetails = new StudentDetails();
				studentDetails.studentPage();
				break;
		default:
			break;
		
		}
	}

}
