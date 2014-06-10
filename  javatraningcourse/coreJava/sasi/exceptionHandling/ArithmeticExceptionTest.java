package exceptionHandling;

public class ArithmeticExceptionTest  {
public static void main(String[] args) throws ArithmeticException {
	int a=10;
	int b=10;
	int c=20;
	try{
		int d=c/(a-b);
}
catch (Exception e){
	System.out.println("This"+e);
}

}
}
