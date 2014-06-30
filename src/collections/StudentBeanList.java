package collections;

public class StudentBeanList implements Comparable<StudentBeanList> {
	
	private int rollno;

	private int standard;
	
	private String name;
	
	public String toString(){
	return "No:: "+rollno+"; Class:: "+standard+"; Name:: "+name;	
	}
	
	@Override
	public int compareTo(StudentBeanList stdObj) {
		int res = this.rollno - stdObj.getRollno();// TODO Auto-generated method stub
		if(res>0)
			return 1;
		else if(res<0)
			return -1;		
		return 0;
	}
	
	
	public StudentBeanList(){
		
	}

	/**
	 * @param rollno
	 * @param standard
	 * @param name
	 */
	public StudentBeanList(int rollno, int standard, String name) {
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
