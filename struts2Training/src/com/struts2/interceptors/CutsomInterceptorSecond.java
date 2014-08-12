package com.struts2.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CutsomInterceptorSecond extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("Second:: I  am gettign control before action method calls");
		
		String  res = invocation.invoke();
		
		System.out.println("Second:: I was called after the execution");
		return res;		
	}

}
