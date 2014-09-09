package com.java.finalexamples;

public class Test {

	public static final String orgName="Prolifics";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		Test test1  = new Test();
		
			System.out.println(Test.orgName); 
			
			
		Test test2  = new Test();
		
		Test test3  = new Test();
		
		*/
		
		
		//ParentClass parentClass  = new ParentClass();
		ParentClass parentClass;
		
		ChildClass childClass  = new ChildClass();
		
		parentClass = childClass;
		
		System.out.println(parentClass.name);
		
		parentClass.method1();
		
		parentClass.method2();
		
		parentClass.method3();
		
		/* this code complies fine but run time it makes a hell
		childClass = (ChildClass) parentClass;
		
		childClass.method1();
		*/
		
		int x = 10;
		
		Integer integer = new Integer(10);
		
		Integer.toBinaryString(x);
		
		 
		

	}

}
