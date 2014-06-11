package exception;

public class BaseExceptionTest {

	static void compute(int a) throws BaseException {
		System.out.println("Called compute(" + a + ")");
		try{
		int x = 100/0;
		if (a > 10)
			throw new ArithmeticException();
		}catch(Exception e){
			throw new BaseException("Its mine I am modifying it"+e.getMessage());
		}
		System.out.println("Normal exit");
	}

	public static void main(String args[]) {
		try {
			compute(1);
			System.out.println("***********************");
			compute(20);
		} catch (BaseException e) {
			System.out.println("It did came here");
			System.out.println("Caught " + e.getMessage());
		}
	}

}
