package myExceptionhandling;


public class ArithmeticExTest {

	public static void main(String[] args){
		
		ArithmeticExTest ex = new ArithmeticExTest();
		
		float mul=0;
		
		mul = ex.mulMethod(10,-6);
		System.out.println(mul);
		try {
		}catch (ArithmeticException e) {			
			//e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
			
		
	}

	private float mulMethod(int i, int j) {
		float mul=0;		
		mul = i/j;	
		return mul;
	
		// TODO Auto-generated method stub
		
		
		}}

