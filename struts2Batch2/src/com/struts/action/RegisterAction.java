package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String name, password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void validate() {
		if (name.length() < 1)
			addFieldError("name", "Name can't be blank");
		if (password.length() < 6)
			addFieldError("password", "Password must be greater than 5");

		/*
		 * if(name.trim().length()<1 || password.trim().length()<1){
		 * addActionError("Fields can't be blank"); }
		 */
	}

	public String execute() {
		
		boolean res = cutomValidate();
		
		if(res){
			System.out.println("I am into execute method");
			
			return "success";
		}
		return "failure";
	}
	
	public boolean cutomValidate(){
		
	
			
		return true;
	}
}
