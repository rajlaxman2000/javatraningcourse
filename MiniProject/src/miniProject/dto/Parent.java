package miniProject.dto;

public class Parent {
	private int parentID;
	private String parentName;
	private int stud_ID;
	private String parentPhone;
	
	public Parent(){
		
	}
	public Parent(String parentName, int stud_ID,String parentPhone) {
		this.parentName = parentName;
		this.stud_ID = stud_ID;
		this.parentPhone = parentPhone;
	}
	
	public Parent(int parentID, String parentName, int stud_ID,
			String parentPhone) {
		this.parentID = parentID;
		this.parentName = parentName;
		this.stud_ID = stud_ID;
		this.parentPhone = parentPhone;
	}
	
	@Override
	public String toString() {
		return "\nParent [parentID=" + parentID + ", parentName=" + parentName
				+ ", stud_ID=" + stud_ID + ", parentPhone=" + parentPhone +"]";
	}
	
	
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public int getStud_ID() {
		return stud_ID;
	}
	public void setStud_ID(int stud_ID) {
		this.stud_ID = stud_ID;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

		
}

