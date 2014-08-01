package com.spring.lifecycle;

public class SpringLifeCycleService {
	
	private StudentBean studentBean;
	
	public SpringLifeCycleService(){
		
	}
	
	public SpringLifeCycleService( StudentBean studentBean){
		this.studentBean = studentBean;
	}
	
	public void startProcess(){
		System.out.println("Student details below ::");
		System.out.println("ID ::" + studentBean.getId() +"\n Name ::"+ studentBean.getName() + "\n Age ::" + 
				studentBean.getAge() + "\n DOB ::"+ studentBean.getDob());
		
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
		System.out.println("SpringLifeCycleService bean cutom destroy method");
	}
	

}
