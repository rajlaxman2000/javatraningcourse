package com.java.collections;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0;i<=4;i++){
			System.out.println(a[i]);
		}
		
		System.out.println(a.length);
		
		String names[] = new String[10];
		
		names[0]="Rajesh";
		names[1]="Mani";
		names[2]="Harsha";
		names[3]="Raghu";
		names[4]="Ravi";
		
		
		for(int i=0;i<=4;i++){
			System.out.println(names[i]);
		}
		
		
	}

}
