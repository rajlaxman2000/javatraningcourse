package immutable;

import java.util.Scanner;

public class ImmuTest {
	public static void main(String[] args) {
		
		ImmutableClass immu= new ImmutableClass();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter amount");
	int amount=sc.nextInt();

		if(amount>immu.maxamount){
			System.out.println("cannot withdraw more than limit(40000)");
		}
		else
			System.out.println("amount drawn="+amount);
		
	}

}
