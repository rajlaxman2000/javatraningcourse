package assignment;

import java.util.Scanner;

public class MaxNumber {
	
	
		
	Scanner sc= new Scanner(System.in);
	
	public void maxnumber(){
		
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");

		int b=sc.nextInt();
		System.out.println("enter c");

		int c=sc.nextInt();
		if(a>b && b>c){
			
			System.out.println("a is max number");
			}
		
			else if(b>c){
				System.out.println("b is max number");

				}
			else
				System.out.println("c is max number");
}
	
	}
