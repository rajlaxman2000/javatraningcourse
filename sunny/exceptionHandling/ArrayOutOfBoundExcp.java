package exceptionHandling;

public class ArrayOutOfBoundExcp {

	public static void main(String[] args) {
	      try{
	           int b[]= new int [2];
	          System.out.println("Access element three :" + b[3]);
	       }catch(ArrayIndexOutOfBoundsException e){
	          System.out.println("Exception thrown  :" + e);
	       }/* finally{
	    	  b[0]=6;
	           System.out.println("First element value: " +b[0]);
	           System.out.println("The finally statement is executed");
	        }*/
	      



	}

}
