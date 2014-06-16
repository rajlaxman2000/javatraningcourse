package overridingwithaccessspecifier;

public class Demo extends Test {

	//protected void display(){ /* works perfect*/
	
	/*
	 * Cannot reduce the visibility of the inherited method from Test 
	 */
	//void display(){
	protected void display(){ /* works perfect*/
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Demo().display();

	}

}
