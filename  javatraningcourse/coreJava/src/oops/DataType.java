package oops;

public class DataType {
	
	//int, long, float, double,  String[]
	 Integer integer = new Integer(5);
	 //Float
	 
	 
	 public static void main(String args[]){
		
		 int x = 90000000;
		 
		 
		// Integer integer = new Integer("1993434");
		 
		 
		 Integer integer = null;
		 
		 try{
			 integer = new Integer("19934f");
		 }catch (NumberFormatException e) {
			System.err.println("Hey seems you didn't pased the compatible string");
		} 
		 
		 System.out.println(x);
		 
		 // hascode, toString,
		 if(integer!=null){
			 System.out.println(integer.shortValue());
		 }
	 }

}
