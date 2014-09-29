package com.java.stringex;

public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = new String("Rajesh");
		
			name = name+" Reddy";
			//name.concat("Reddy");
			
		StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(name);
			stringBuilder.append("; Age:31");
			
	System.out.println(stringBuilder.toString());
			
			
		/*	
		String name2 = new String("; Ravi");
		
		System.out.println("Name is :: "+name2);
*/
	}

}
