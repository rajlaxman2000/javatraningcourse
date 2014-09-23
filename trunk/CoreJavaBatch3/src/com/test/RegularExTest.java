package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fieldValue = "w!ert1234";
		
		//Pattern regex = Pattern.compile("[$&+,:;=?@#|]");
		//[$&+,:;=?@#|'<>.^*()%!-]
		
		Pattern regex = Pattern.compile("[$&+,:;=?@#|'<>.^*()%!-]");
		Matcher matcher = regex.matcher(fieldValue.subSequence(0,1));
		if (matcher.find()){
		   System.out.println(true);
		}else{
			System.out.println(false);
		}

	}

}
