package jdbcpractise;

public class EmpAddress {
	private int doorNo;
	private String streetLane1;
	private String streetLane2;
	private int pinCode;
	
	@Override
	public String toString() {
		return "EmpAddress [doorNo=" + doorNo + ", streetLane1=" + streetLane1
				+ ", streetLane2=" + streetLane2 + ", pinCode=" + pinCode + "]";
	}
	public EmpAddress(int doorNo, String streetLane1, String streetLane2,
			int pinCode) {
		super();
		this.doorNo = doorNo;
		this.streetLane1 = streetLane1;
		this.streetLane2 = streetLane2;
		this.pinCode = pinCode;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetLane1() {
		return streetLane1;
	}
	public void setStreetLane1(String streetLane1) {
		this.streetLane1 = streetLane1;
	}
	public String getStreetLane2() {
		return streetLane2;
	}
	public void setStreetLane2(String streetLane2) {
		this.streetLane2 = streetLane2;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	

}
