package myExceptionhandling;

public class ArrayIndexOutofBoundExTest {

	 public static void main(String args[])
	 { String[] currencies = {"GBP", "USD", "JPY", "EUR", "INR"}; 
	 System.out.println("Supported currencies for trading : "); 
	 try{
	 for (int i = 0; i <= currencies.length; i++) {
		 System.out.println(currencies[i]);
	 }
	 }catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Array Index Out Of Bounds Exception"+e);
	 
		 }
	 }

}
