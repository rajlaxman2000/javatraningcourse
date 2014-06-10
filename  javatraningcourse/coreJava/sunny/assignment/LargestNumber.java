package assignment;

public class LargestNumber {
public int a,b,c;
public LargestNumber(int a,int b,int c){
	this.a=a;
	this.b=b;
	this.c=c;
	if(a>b&&a>c){
		System.out.println("Largest number is:"+a);
	}else if(b>a&&b>c){
		System.out.println("Largest number is:"+b);
		
	}else 
		System.out.println("largest is:"+c);
		
		/*if (c>a&&c>b){
		System.out.println("largest number is:"+c);*/
	}
}

