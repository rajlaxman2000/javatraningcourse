package collectionsBankPro;

public class CustomarBeanList {
	private String acType;
	private int acNo;
	String fname;
	String lname;
	/**
	 * @param fname
	 * @param lname
	 * @param acType
	 * @param acNo
	 */
	public String toString(){
		return "First Name: "+fname+" Last Name: "+lname+" AC No.: "+acNo+" AC Type: "+acType;
	}
	public CustomarBeanList(){
		
	}
	public CustomarBeanList(String acType, int acNo, String fname,String lname) {
		super();
		this.acType = acType;
		this.acNo = acNo;
		this.fname = fname;
		this.lname = lname;

	}

	/**
	 * @return the acType
	 */
	public String getAcType() {
		return acType;
	}

	/**
	 * @param acType
	 *            the acType to set
	 */
	public void setAcType(String acType) {
		this.acType = acType;
	}

	/**
	 * @return the acNo
	 */
	public int getAcNo() {
		return acNo;
	}

	/**
	 * @param acNo
	 *            the acNo to set
	 */
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

}
