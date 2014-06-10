package exceptionHandling;

public class ArrayOutOfBoundsExceptionTest{
public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
	int i[]={10,20,30,40,};
	try{
		for(int j=6;j>0;j--){
			System.out.println(i[j]);
		}
	}
catch(Exception e){
	System.out.println("Array index Out Of bounds EXP"+e);
	
}
finally{
	System.out.println("Exception Raised");
}
}
}
