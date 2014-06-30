package exception;

public class ExceptionTest {

	public static void main(String[] args){
		
		ExceptionTest test = new ExceptionTest();
		
		float res=0;
		/*
		try {
			res = test.devideMethod(10,0);
		}catch (ArithmeticException e) {			
			System.out.println();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		*/
		test.logicalAgeTest(120);
		
		try {
			test.logicalAgeTest2(120);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(res);
		
	}
	
	public float  devideMethod(int x, int y) throws ArithmeticException,Exception{
		
		float res=0;		
		res = x/y;	
		return res;
	}
	
	
	public boolean logicalAgeTest(int age) {
		
		if(age<0 ||  age>100){
			Exception ex = new Exception("It doesn't seems to not logical");
			
			try {
				throw ex;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//throw new Exception("It doesn't seems to ne logical");
		}
		// Test test = new Test();
		return true;
	}
	
	public boolean logicalAgeTest2(int age) throws Exception {
		
		if(age<0 ||  age>100){
			Exception ex = new Exception("It doesn't seems to not logical");
			throw ex;
			
			//throw new Exception("It doesn't seems to ne logical");
		}
		// Test test = new Test();
		return true;
	}
}
