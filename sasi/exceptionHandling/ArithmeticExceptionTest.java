package exceptionHandling;

public class ArithmeticExceptionTest {
	
	// public static void main(String[] args) throws ArithmeticException {
	
	
	public void exe() throws MyOwnException{
		
		MyOwnException ex = new MyOwnException("Hello Am Exception");
		int a = 10;
		int b = 10;
		int c = 20;
		/*
		if(a-b!=0){
			int d = c / (a - b);
		}else{
			throw ex;
		}*/
		
		int d = c / (a - b);
			
		

	}
}
