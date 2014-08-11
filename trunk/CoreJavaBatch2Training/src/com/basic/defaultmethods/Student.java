package com.basic.defaultmethods;

public class Student {
	
	private String name;
	
	private int sno;
	
	private int age;
	
	public Student(String name, int sno, int age){
		
		this.name=name;
		this.sno=sno;
		this.age=age;
	}
	
	public String toString(){
		
		return "Studnet name:: "+this.name+"\n Student age::"+this.age+"\n Studnet sno ::"+this.sno;
	}
	
	public int hashCode(){
		return name.hashCode()+sno+age;
	}

	public boolean equals(Object object){
		
		Student std = (Student)object;
		
		if( this.name == std.name && this.sno == std.sno && this.age == std.age)
			return true;
		
		return false;
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

	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
