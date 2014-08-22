package com.overriding.tricks;

public class SubClass extends BaseClass {
	  // Static is removed here (Causes Compiler Error) 
    public void display2() {
        System.out.println("Non-static method from Derived");
    }
     
    // Static is added here (Causes Compiler Error) 
    public static void print2() {
        System.out.println("Static method from Derived");
   }
    
    // Non-static method which will be overridden in derived class 
    public void print(int x)  {
        System.out.println("Non-static or Instance method from Base");
   }
    
    public static void display(int x) {
        System.out.println("Static or class method from Base");
    }
}
