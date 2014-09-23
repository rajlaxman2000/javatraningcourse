package com.java.collections;

import java.util.Collections;
import java.util.Comparator;

public class Compare1 implements Comparator<Compare1>,Comparable<Compare1>{


		   private String name;
		   private int age;
		   Compare1(){
		   }

		   Compare1(String n, int a){
		      name = n;
		      age = a;
		   }

		   public String getCompare1Name(){
		      return name;
		   }

		   public int getCompare1Age(){
		      return age;
		   }

		   
		   public int compareTo(Compare1 d){
		      return (this.name).compareTo(d.name);
		   }

		   
		   public int compare(Compare1 d, Compare1 d1){
		      return d.age - d1.age;
		   }
		}

		