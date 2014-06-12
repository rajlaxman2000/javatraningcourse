package assignment;



	
	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	public class Factorial {
	
	
	long fact(long a){
	if(a <= 1)
	return 1;
	else{
	a= a*fact(a-1);
	return a;
	}
	}
	public static void main (String arr[]) throws IOException{
	System.out.println("Enter a number to find factorial");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt( br.readLine());
	Factorial f = new Factorial();
	System.out.println(f.fact(num));
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

