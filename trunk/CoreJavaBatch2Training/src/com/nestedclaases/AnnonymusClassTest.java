package com.nestedclaases;


abstract class Person{
	
	abstract void test();
	
}

public class AnnonymusClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person(){
			void test(){
				System.out.println("Looks like method of inside");
			}
		};
		person.test();
	}

}
