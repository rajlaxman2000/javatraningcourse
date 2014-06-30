package exceptionHandling;

public class StringIndexOutOfBoundsTest {
public static void main(String[] args) throws StringIndexOutOfBoundsException{
	String a="guravalankanapalli";
	int k,i;
	i=a.length();
	try{
		for(k=i;k>0;k--){
			System.out.println(a.charAt(k));
		}
	}
catch(Exception e){
	System.out.println("String Exception"+e);
}
}
}
