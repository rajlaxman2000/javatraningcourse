package com.spring.annotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component(value="annotation.component.service")
//@Controller
//@Repository
@Service(value="annotation.component.service")
public class SpringComponentAnnotationService {
	
	/*
	@Autowired
	@Qualifier("sasibean")
	*
	*Resource(name="student2.bean")
	*/	
	@Resource(name="student2.bean")
	private StudentBean studentBean;
	
	public SpringComponentAnnotationService(){
		
	}
	
	public SpringComponentAnnotationService( StudentBean studentBean){
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
		System.out.println("SpringLifeCycleService bean cutom destroy method like afterPropertiesSet method");
	}
	

}
