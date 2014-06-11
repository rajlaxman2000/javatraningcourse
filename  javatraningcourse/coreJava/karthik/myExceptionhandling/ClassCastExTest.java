package myExceptionhandling;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassCastExTest {

  public  ClassCastExTest() 
	// TODO Auto-generated constructor stub
  {
    List list = new ArrayList();
    list.add("one");
    
    // ... some time later
    
    Iterator it = list.iterator();
    while (it.hasNext())
    {
      // intentionally throw a ClassCastException by
      // trying to cast a String to an
      // Integer (technically this is casting
      // an Object to an Integer, where the Object is 
      // really a reference to a String.
    	try{
      Integer i = (Integer)it.next();
    	}
    	catch(ClassCastException e){
    		System.out.println("ClasscastException Caught"+e.getMessage());
    		
    	}
    }
  }

  public static void main(String[] args)
  {
    new ClassCastExTest();
  }

}


