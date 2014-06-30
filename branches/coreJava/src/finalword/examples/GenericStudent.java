package finalword.examples;

import oops.Student;

public final class GenericStudent {
	
	//The class GenericStudent can be either abstract or final, not both
	//abstart , final 
	
	private int stdNo;
	private String stdName;
	private int stdAge;
	
	private static final float PI =  3.14f;
	
		
	public GenericStudent(){
		
	}
	
	/**
	 * @param stdNo
	 * @param stdName
	 * @param stdAge
	 */
	public GenericStudent(int stdNo, String stdName, int stdAge) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	

	public static GenericStudent studentDetails(){	
		
		return new GenericStudent(120+(int)PI,"RAghu", 10);
	}
	
	
	
	
	
	
	/**
	 * @return the stdNo
	 */
	public int getStdNo() {
		return stdNo;
	}
	/**
	 * @param stdNo the stdNo to set
	 */
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	/**
	 * @return the stdName
	 */
	public String getStdName() {
		return stdName;
	}
	/**
	 * @param stdName the stdName to set
	 */
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	/**
	 * @return the stdAge
	 */
	public int getStdAge() {
		return stdAge;
	}
	/**
	 * @param stdAge the stdAge to set
	 */
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	
	
	

}
