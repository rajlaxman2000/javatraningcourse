package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCount {
	public static void main(String[] args) {
		
		 int i[]= new int[10];
		 int a[]= new int[10];
		 int count[]=new int[10];
		 int k;
		 Scanner sc= new Scanner(System.in);
		 
		 for(int j=0;j<10;j++){
			 System.out.println("enter i["+j+"] Value:");
			 i[j]=sc.nextInt();
			 count[j]=1;

		 }
		 /*for(int j=0;j<10;j++){
			 System.out.print(i[j]);
		 }*/
		 Arrays.sort(i);
		 System.out.println("sorting order is"+Arrays.toString(i));
	 
		 for(int j=0;j<i.length;j++){
			 for( k=j+1;k<i.length;k++){
				 if(i[j]==i[k]&&k!=j){
					 
					a[j]=i[j];
					 System.out.println("duplicate numbers  "+i[j]);
					 count[j]++;
			 }
				
		 }
		 
			 //System.out.println("count"+count[j]); 
		 }
		 
	}}


