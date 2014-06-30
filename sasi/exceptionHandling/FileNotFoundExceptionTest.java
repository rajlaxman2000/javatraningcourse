package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class FileNotFoundExceptionTest {
public static void main(String[] args) throws Exception{
	try{
		BufferedReader br= new BufferedReader(new FileReader("D:\\text.xt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
	catch(Exception e){
		//e.getStackTrace();
		System.out.println(e);
	}
}
}
