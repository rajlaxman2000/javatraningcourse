package oops;

import java.util.Arrays;
import java.util.Collections;

public class SumLogicTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//SumLogic logic = new SumLogic(n, c);
		
		//SumLogic logic = new SumLogic(5, 2);
		// 0 + 1 + 2 + 6 + 12 = 21
		
		//SumLogic logic = new SumLogic(5, 3);
		// 0 + 1 + 2 + 6 + 24 = 33
		
		
		//SumLogic logic = new SumLogic(10, 2);
		// 0 + 1 + 2 + 6 + 24 + 60 + 120 + 210 + 336 + 504  = 33
		SumLogic logic = new SumLogic(100, 10);
		
		System.out.println(logic.findSum());

	}

}
