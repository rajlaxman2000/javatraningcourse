package com.basic.classes;

public class TestClass {
	
	public static void main(String[] args){
		
		/*ClassB classB = (ClassB) new ClassA();
		classB.methodClasB();		
		classB.printAClassValues();
		
		ClassA classA = new ClassB();
		
		((ClassB)classA).methodClasB();		
		classA.printAClassValues();
		*/
		
		ClassA classb =  new ClassB();
		//classB.methodClasB();		
		//classB.printAClassValues();
		
		classb.printYourBehaviour();
		
		System.out.println(classb.name);
		
	}

}
