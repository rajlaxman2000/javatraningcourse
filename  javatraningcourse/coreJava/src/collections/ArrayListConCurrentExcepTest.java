package collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ArrayListConCurrentExcepTest {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");	
		//list.add("C");	
		try{
			for (String str : list) {
				if (str.equals("B")) {
					list.remove(new String("B"));
				}
			}
		}catch(ConcurrentModificationException ex){
			//System.out.println(ex);
			ex.printStackTrace();
		}
		
		for( String str : list ) {
			System.out.println( str );
		}
 	}
 }
 

/* Solution 1 

public class ArrayListConCurrentExcepTest {
	public static void main(String args[]) {
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		

		for (String str : list) {
			if (str.equals("B")) {
				list.remove(new String("B"));
			}
		}
		
		 for( String str : list ) {
		      System.out.println( str );
		    }
	}
}
*/
/* Solution 2 
public class ArrayListConCurrentExcepTest {
	 public static void main( String args[] ){
	  
	    List<String> list = new ArrayList<String>();
	    list.add("A");
	    list.add("B");
	    
	    
	    for( Iterator< String > it = list.iterator(); it.hasNext() ; ){
	      String str = it.next();
	      if( str.equals( "B" ) ){
	        it.remove();
	      }
	    }
	    
	    for(String str:list){
	      System.out.println( str );
	    }
	  }
}
*/