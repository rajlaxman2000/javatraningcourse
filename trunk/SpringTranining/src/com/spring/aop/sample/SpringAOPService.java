package com.spring.aop.sample;

public class SpringAOPService {
	
	private StudentBean studentBean;
	
	public SpringAOPService(){
		
	}
	
	public SpringAOPService( StudentBean studentBean){
		this.studentBean = studentBean;
	}
	
	public void startProcess() throws Exception{		
		System.out.println("Student details below ::");
		System.out.println("ID ::" + studentBean.getId() +"\n Name ::"+ studentBean.getName() + "\n Age ::" + 
				studentBean.getAge() + "\n DOB ::"+ studentBean.getDob());
		throw (new Exception("This is done intentionally"));
	}

	/**
	 * @return the studentBean
	 */
	public StudentBean getStudentBean() {
		return studentBean;
	}

	/**
	 * @param studentBean the studentBean to set
	 */
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	
	/**
	 * This method will be called based on config of individual bean destroy tag
	 */
	public void customDestroy()  {
		System.out.println("SpringLifeCycleService bean cutom destroy method like afterPropertiesSet method");
	}
	
}
