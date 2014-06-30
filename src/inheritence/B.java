package inheritence;

public class B extends A{
	
	public static void main(String[] args){
		
		B obj = new B();
		
		obj.methodB();
		
		obj.methodA();
	
	}
	
	public void methodB(){
		System.out.println("I am method from class B");
		
	}

}
