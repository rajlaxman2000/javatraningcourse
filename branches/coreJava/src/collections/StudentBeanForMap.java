package collections;

public class StudentBeanForMap {
	
	private int sNo;
	
	private String sName;
	
	
	private Integer age;

	
	public String toString(){
		return "Sno:: "+sNo+" ; sName:: "+sName+"; age:: "+age;
	}
	public StudentBeanForMap(){
		
	}	

	/**
	 * @param sNo
	 * @param sName
	 * @param age
	 */	
	public StudentBeanForMap(int sNo, String sName, Integer age) {
		this.sNo = sNo;
		this.sName = sName;
		this.age = age;
	}


	/**
	 * @return the sNo
	 */
	public int getsNo() {
		return sNo;
	}


	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(int sNo) {
		this.sNo = sNo;
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
	public Integer getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
