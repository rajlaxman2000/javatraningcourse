package collectionsBankPro;

public class CustomarBeanList {
	private String acType;
	private int acNo;

	/**
	 * @param fname
	 * @param lname
	 * @param acType
	 * @param acNo
	 */
	public CustomarBeanList(String acType, int acNo) {
		super();
		this.acType = acType;
		this.acNo = acNo;
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

}
