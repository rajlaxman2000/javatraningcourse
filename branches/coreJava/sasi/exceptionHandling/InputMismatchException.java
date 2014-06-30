package exceptionHandling;

import java.util.Scanner;

public class InputMismatchException {
public static void main(String[] args) {
	int i[]=new int[4];
	Scanner sc=new Scanner(System.in);
	try{
	for(int k=0;k<4;k++){
		i[k]=sc.nextInt();
	}
	}
	catch(Exception e){
		System.out.println(e);
	}
	for(int k=0;k<4;k++){
	System.out.println(i[k]);
}
}
}
