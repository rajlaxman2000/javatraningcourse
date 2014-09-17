package miniProject.dto;



public class Student
{
		private int studentID;
		private String studentName;
		private int branchLoc;
		
		public Student(){
		}
		
		public Student(int studentID, String studentName, int branchLoc){
			this.studentID = studentID;
			this.studentName = studentName;
			this.branchLoc = branchLoc;
		}
		
		@Override
		public String toString() {
			return "studentID = " + studentID + ", student name = " + studentName
					+ ", branch Location ID = " + branchLoc;
		}
		
		
		public int getStudentID() {
			return studentID;
		}


		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}


		public String getStudentName() {
			return studentName;
		}


		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}


		public int getBranchLoc() {
			return branchLoc;
		}


		public void setBranchLoc(int branchLoc) {
			this.branchLoc = branchLoc;
		}


		
		
}
