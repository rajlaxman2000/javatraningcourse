package exception;

import java.io.FileNotFoundException;

public class TryWithOutCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}finally{
			System.out.println(); 
			System.out.println("From finally block");
		}

	}
	
	public void check() throws FileNotFoundException{
		try{
			throw new FileNotFoundException();
		}finally{
			System.out.println("Checking finally");
		}
	}

}
