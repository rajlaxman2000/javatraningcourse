package com.java.finalexamples;

public class ParentClass {
	
	
	public String name="Parent"; 
	
	public void method1(){
		
		System.out.println("I am method1 from Parent class");
	}

	public static void method2(){
		System.out.println("I am method2 from Parent class");
	}
	
	public void method2(int x){
		System.out.println("I am method2 from Parent class");
	}
	
	public final void method3(){
		System.out.println("I am final method3 from Parent class");
	}
	
	
	public void method3(int a){
		System.out.println("I am method3 from Parent class");
	}
}
