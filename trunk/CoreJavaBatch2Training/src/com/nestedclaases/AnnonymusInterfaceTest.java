package com.nestedclaases;


interface Person1{
	void testInte();
}

public class AnnonymusInterfaceTest {

	public static void main(String[] args){
		
		Person1 person = new Person1() {

			@Override
			public void testInte() {
				System.out.println("I am the mthod classed inside of a onject interface");				
			}
		};
		
		person.testInte();
		
		
	}
}
