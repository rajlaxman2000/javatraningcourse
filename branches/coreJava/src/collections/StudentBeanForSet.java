package collections;

public class StudentBeanForSet implements Comparable<StudentBeanForSet>{
	
	private int rollno;

	private int standard;
	
	private String name;
	
		
	public int compareTo(StudentBeanForSet stdObj) {
		int res = this.rollno - stdObj.getRollno();
		if(res>0)
			return 1;
		else if(res<0)
			return -1;		
		return 0;
	}
	
	
	public String toString(){
		
		return "Roll no::"+this.rollno+"; Class ::"+this.standard+"; Name::"+this.name+"\n";
		
	}
	
	public boolean equals(Object obj){
		StudentBeanForSet std = (StudentBeanForSet)obj;
		if( std.getRollno() == this.rollno && 
					std.getStandard() == this.standard && this.name.equals(std.getName()))
			return true;
		return false;
	}
	
	
	public int hashCode(){
		
		return this.rollno+this.standard+this.name.hashCode();
	}
	
	
	public StudentBeanForSet(){
		
	}

	/**
	 * @param rollno
	 * @param standard
	 * @param name
	 */
	public StudentBeanForSet(int rollno, int standard, String name) {
		this.rollno = rollno;
		this.standard = standard;
		this.name = name;
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the standard
	 */
	public int getStandard() {
		return standard;
	}

	/**
	 * @param standard the standard to set
	 */
	public void setStandard(int standard) {
		this.standard = standard;
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
	
}
