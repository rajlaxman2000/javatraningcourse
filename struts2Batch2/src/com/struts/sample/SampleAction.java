package com.struts.sample;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SampleAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute(){
		
		System.out.println("I am in sample action class");
		
		//return Action.SUCCESS;
		
		return "success";
	}
	
}
