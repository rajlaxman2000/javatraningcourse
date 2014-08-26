package com.nestedclaases;

public class LocalClassTest {
	
	public void display(){
		
		class Local{
			void msgPrint(){
				System.out.println("I am from msgPrint method of LocalClassTest ");
			}
		}
		
		Local local = new Local();
		
		local.msgPrint();
	}
	
	public static void main(String[] args) {
	
		LocalClassTest localClassTest = new LocalClassTest();
		
		localClassTest.display();
	}

}
