package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	

		   public static void main(String args[]){
		      
		      ArrayList<Compare1> list = new ArrayList<Compare1>();

		      list.add(new Compare1("harsha",3));
		      list.add(new Compare1("manideep",2));
		      list.add(new Compare1("teja",10));
		      list.add(new Compare1("harmil",4));
		      list.add(new Compare1("katakam",1));
		      Collections.sort(list);

		      for(Compare1 a: list)
		         System.out.print(a.getCompare1Name() + ", ");

		    
		      Collections.sort(list, new Compare1());
		      System.out.println(" ");
		      for(Compare1 a: list)
		         System.out.print(a.getCompare1Name() +"  : "+
				 a.getCompare1Age() + ", ");
		   }
		}
