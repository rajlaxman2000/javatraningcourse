package staticexamples;

public class Student {

	
	static{
		//System.out.println("Hi I am the fisrt thing to be executed");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("Main method is executed");
		
		Sample sample1 = new Sample();
		Sample sample2 = new Sample();
		
		Sample.staticMethod();
		System.out.println(Sample.x);
		
		 
		
		

	}

}
