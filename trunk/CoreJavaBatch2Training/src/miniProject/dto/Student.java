package miniProject.dto;

import miniProject.dao.impl.StudentDAOImpl;

public class Student extends StudentDAOImpl
{
		private int studentID;
		private String name;
		private int branchLocation;
		
		public Student(){
		}
		public Student(int studentID, String name, int branchLocation){
			this.studentID = studentID;
			this.name = name;
			this.branchLocation = branchLocation;
		}
		@Override
		public String toString() {
			return "studentID = " + studentID + ", student name = " + name
					+ ", branch Location ID = " + branchLocation;
		}
		
}
