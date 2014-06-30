package myExceptionhandling;

public class NumberFormatExTest {

	 
	  public static void main(String[] args)
	  {
		  float a=6;
	    try
	    {
	      String s = "myname";
	      int i = Integer.parseInt(s);
	      // this line of code will never be reached
	      System.out.println("int value = " +s);
	    }
	    catch (NumberFormatException e)
	    {
	     System.out.println("Number format exception "+e);
	    }
	  }
	 
	}


