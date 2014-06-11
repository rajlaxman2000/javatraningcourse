package exceptionHandling;

public class ArithmeticExceptionTest  {
//public static void main(String[] args) throws ArithmeticException {
	public void exe(){
//	Exception ex = new Exception("Helllo Am Exception");
		int a=10;
	int b=10;
	int c=20;
	try{
		int d=c/(a-b);
	//	throw ex;
}
catch (Exception e){
	System.out.println("Hell Is always goood"+e.getMessage());
}

}
}
