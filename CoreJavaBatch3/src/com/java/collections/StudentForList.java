package com.java.collections;

public class StudentForList implements Comparable<StudentForList>{
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String classDes;
	

	@Override
	public int compareTo(StudentForList student) {
	
		// This logic will be to sort on id basis
		if(this.id > student.getId()){
			return 1;
		}else if(this.id < student.getId()){
			return -1;
		}
			
		return 0;
	
		
		/*
		String str1 = this.name;
		String str2 = student.getName();
		
		int x = str2.compareTo(str1);
			
		return x;
		*/
	}
	
	
	
	
	public boolean equals(Object obj){

		StudentForList student = (StudentForList)obj;
		
		if( this.id == student.id && this.age == student.age && (this.name).equalsIgnoreCase(student.name)){
			return true;
		}
		
		return false;
	}
	
	public int hashCode(){
		return id+age+name.hashCode();
	}
	
	public String toString(){
		return "Student Id::"+id+"; Student Name::"+name+"; Student Age::"+age+"; Student Education ::"+classDes+"\n";
	}

	public StudentForList() {		
	
	}
	public StudentForList(int id, String name) {		
		this.id = id;
		this.name = name;		
	}
	
	public StudentForList(int id, String name, int age, String classDes) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.classDes = classDes;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	/**
	 * @return the classDes
	 */
	public String getClassDes() {
		return classDes;
	}
	/**
	 * @param classDes the classDes to set
	 */
	public void setClassDes(String classDes) {
		this.classDes = classDes;
	}

	
	
	
	

}