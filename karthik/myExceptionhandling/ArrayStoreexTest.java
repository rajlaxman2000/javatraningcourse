package myExceptionhandling;

//kimport exception.ExceptionTest;

public class ArrayStoreexTest extends Exception {
	
		public static void main(String[] args){
			
			//ExceptionTest test = new ExceptionTest();
			
			Object x[]=new String[3];
			 
			try {
				x[0]=new Integer(10);

			
			}catch (ArrayStoreException e) {			
				System.out.println("Array cannot acceptable:"+e);
				//e.printStackTrace();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
			}}
			
		}



