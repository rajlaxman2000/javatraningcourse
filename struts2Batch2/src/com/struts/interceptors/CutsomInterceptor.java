package com.struts.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CutsomInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("I am gettign control before action method calls");
		
		String  res = invocation.invoke();
		
		System.out.println("I was called after the execution");
		return res;		
	}
	

}
