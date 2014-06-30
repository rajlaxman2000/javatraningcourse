package exceptionHandling;

public class NullPointerExceptionTest {

    private static String name;
  
    public static void main(String args[]) throws Exception{
      try{
    	  
      
        if(name.equals("Java")){
            System.err.println("Welcome to Java");
        }
      }
      catch(Exception e){
    	  System.out.println("Null"+e);
      }
      }
}
