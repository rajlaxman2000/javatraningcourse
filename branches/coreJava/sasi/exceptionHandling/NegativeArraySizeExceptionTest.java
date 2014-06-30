package exceptionHandling;

public class NegativeArraySizeExceptionTest {
public static void main(String[] args) throws NegativeArraySizeException {
	int i[]= new int[-10];
	int k;
	try{
		for(k=0;k<=10;k++){
			System.out.println(i[k]);
		}
	}
	catch(Exception e){
		System.out.println("Exception:"+e);
	}
}
}
