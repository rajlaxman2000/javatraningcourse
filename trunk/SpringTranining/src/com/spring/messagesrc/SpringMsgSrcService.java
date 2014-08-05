package com.spring.messagesrc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class SpringMsgSrcService {
	
	private StudentBean studentBean;
	
	
	
	@Autowired
	private MessageSource messageSource;
	
	public SpringMsgSrcService(){
		
	}
	
	public SpringMsgSrcService( StudentBean studentBean){
		this.studentBean = studentBean;
	}
	
	public void startProcess(){
		
		/*	System.out.println("Student details below ::");		
		
			System.out.println("ID ::" + studentBean.getId() +"\n Name ::"+ studentBean.getName() + "\n Age ::" + 
				studentBean.getAge() + "\n DOB ::"+ studentBean.getDob());		
		*/
		System.out.println(this.messageSource.getMessage("student.display.msg", null,"This is default message", null));
		System.out.println(this.messageSource.getMessage("student.details.msg", 
				new Object[]{	studentBean.getId(),studentBean.getName(),studentBean.getAge(),studentBean.getDob()},
				"default student details msg",
				null));		
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

	/**
	 * @return the messageSource
	 */
	public MessageSource getMessageSource() {
		return messageSource;
	}

	/**
	 * @param messageSource the messageSource to set
	 */
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	
	

}
