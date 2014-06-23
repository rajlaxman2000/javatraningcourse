package com.student.action;

public class ApplicationChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * I need a choice option where user can select insert or delete or edit or search of student details
		 */
		
		
		String choice = "exit";
		ApplicationChoice obj = new ApplicationChoice();
		
		do{
			
			System.out.println("1.Insert");
			System.out.println("2.Edit");
			System.out.println("3.search");
			System.out.println("4.delete");
			System.out.println("5.exit");
			
			//swiitch()
		}while(choice.equalsIgnoreCase("exit"));

	}
	
	public boolean insertStudent(){

		return false;
	}
	
	public boolean editStudent(){
		
		return false;
		
	}
	
	

}
