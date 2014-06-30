package exceptionHandling;

public class MyOwnException extends RuntimeException{
	
	public String msg;
	
	public MyOwnException(){
		
	}
	
	public MyOwnException(String msg){		
		super(msg);	
		this.msg = msg;
	}
	
	 public String getMessage() {
	        return "sjgfjzhgdzjhgczjxhg";
	    }

}
