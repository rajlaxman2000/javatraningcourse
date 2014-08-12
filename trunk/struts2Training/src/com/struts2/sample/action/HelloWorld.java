package com.struts2.sample.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class HelloWorld extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String name;
	
	public String execute() throws Exception{
		
		
		System.out.println("I am in default execute method of HelloWorld Action class");
		
		return Action.SUCCESS;
	}
	
	public static void main(String[] args){
		System.out.println("Hello world");
	}
	
	public String executeTest() throws Exception{
		System.out.println("I am in cutome executeTest method of HelloWorld Action class");
		if(name.equalsIgnoreCase("redirect")){
			return "customstring"; 
		}
		return Action.SUCCESS;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
