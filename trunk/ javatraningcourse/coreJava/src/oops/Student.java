package oops;

public class Student {
	
	private int age;
	
	private int no;
	
	private String name;
	
	public int marks;
	
	
	/**
	 * @return the age
	 */
	public int getAge(int password) {
		if(password==007){
			return age;
		}
		return 0;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age>=100){
			System.err.println("You can't do that man");
		}else{
			this.age = age;
		}
		
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
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
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(){
		
	}
	
	public Student(int age, int no, String name){
		System.out.println("Constructor called");
		this.age = age;
		this.no = no;
		this.name = name;
		
		int marks=100;
		this.marks= marks;
		
	}
	
	/*
	public Student(int stdAge, int stdNo, String stdName){	
		System.out.println("Constructor called");
		age = stdAge;
		no = stdNo;
		name = stdName;		
	}	
	*/
}
