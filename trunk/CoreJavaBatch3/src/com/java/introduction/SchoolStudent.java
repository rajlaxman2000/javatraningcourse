package com.java.introduction;

public class SchoolStudent extends Student {
	
	private String schoolName;
	
	private String className;
	
	public SchoolStudent(){
		
	}
	
	public SchoolStudent(String schoolName){
		this.schoolName = schoolName;		
	}
	
	public SchoolStudent(String schoolName, String className){
		this.schoolName =  schoolName;
		this.className = className;
	}
	
	public SchoolStudent(int id, String name, int age, String dob, String schoolName, String className){
		
		super(id,name,age,dob);
		
		this.schoolName =  schoolName;
		this.className = className;

	}

	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
