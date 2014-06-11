package exception;

public class BaseException extends Exception {

	private static final long serialVersionUID = 1L;
	private int detail=0;

	public BaseException() {
		// TODO Auto-generated constructor stub
	}
	
	BaseException(int a) {
		detail = a;
	}
	
	BaseException(String str) {
		super(str);

	}

	public String toString() {
		return "MyException[" + detail + "]";
	}
	
	public String getMessage(){
		
		return super.getMessage();
	}

}
