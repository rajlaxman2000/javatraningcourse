package miniProject.dto;

public class SchoolBranch {
	private int branchLocation;
	private String branchPhone;
	
	public SchoolBranch(){
		
	}
	public SchoolBranch(int branchLocation, String branchPhone) {
		this.branchLocation = branchLocation;
		this.branchPhone = branchPhone;
	}
	
	
	
	@Override
	public String toString() {
		return "\nSchoolBranch [branchLocation=" + branchLocation
				+ ", branchPhone=" + branchPhone + "]";
	}

	public int getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(int branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getBranchPhone() {
		return branchPhone;
	}

	public void setBranchPhone(String branchPhone) {
		this.branchPhone = branchPhone;
	}
	
	
}
