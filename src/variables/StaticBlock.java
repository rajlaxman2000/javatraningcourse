package variables;

public class StaticBlock {
	
	public static float pi ;
	
	static {
		pi = (float) 3.14;
		System.out.println("I am the static block");
	}
	
	
	public StaticBlock(){
		
		System.out.println("I am constructor");
		
	}
	
	static {
		System.out.println("I am the secind static block");
	}

}
