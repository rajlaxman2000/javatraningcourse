package collections.map;

public class Student implements Comparable<Student>{
	
	private int sNO;
	
	private String sName;
	
	private int age;
	
	public boolean equals (Object object){
		Student student = (Student) object; 
		
		if (student.getsNO()== this.sNO && student.getsName().equalsIgnoreCase(this.sName) && student.getAge() == this.age ){
			return true;
		}
		return false;
		
	}
	
	
	public int hashCode(){
	
		return this.sNO+this.sName.hashCode()+this.age;
	}
	
	public Student(){
		
	}
	
	public String toString(){
		return "\nStudent No::"+sNO+"; Student Name::"+sName+"; Student Age::"+age;
	}

	/**
	 * @param sNO
	 * @param sName
	 * @param age
	 */
	public Student(int sNO, String sName, int age) {
		this.sNO = sNO;
		this.sName = sName;
		this.age = age;
	}

	/**
	 * @return the sNO
	 */
	public int getsNO() {
		return sNO;
	}

	/**
	 * @param sNO the sNO to set
	 */
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}

	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}

	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
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



	@Override
	public int compareTo(Student student) {
		
		if(this.sNO < student.getsNO())
			return -1;
		else if(this.sNO>student.getsNO())
			return 1;
		return 0;
	}
	
	

}
