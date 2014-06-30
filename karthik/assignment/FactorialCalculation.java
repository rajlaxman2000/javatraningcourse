package assignment;

import java.util.Scanner;

public class FactorialCalculation {
	public static void main(String[] args) {
		
	int n;
	int fact=1;
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of n");
		n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
		
		fact=fact*i;
	}
	System.out.println("factorial of n="+fact);
	
}
}