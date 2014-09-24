package com.student.dto;

public class Parent {
	private int parentID;
	private String parentName;
	private int stud_ID;
	
	public Parent(){
		
	}
	public Parent(String parentName, int stud_ID) {
		this.parentName = parentName;
		this.stud_ID = stud_ID;
	}
	public Parent(int parentID, String parentName, int stud_ID) {
		this.parentID = parentID;
		this.parentName = parentName;
		this.stud_ID = stud_ID;
	}

	@Override
	public String toString() {
		return "\nParent [parentID=" + parentID + ", parentName=" + parentName
				+ ", stud_ID=" + stud_ID + "]";
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
	
	
}

