package staticexamples;

public class Sample {
	
	public int no;
	
	public static int x=123;

	
	static{
		System.out.println("I am the static block of class Sample");
	}
	
	static{
		System.out.println("2nd static block :: I am the static block of class Sample");
	}
	
	public void printClassName(){
		System.out.println("My class name is Sample");
	}
	
	public static void staticMethod(){
		System.out.println("I am teh static method of class sample");
	}
	

}
