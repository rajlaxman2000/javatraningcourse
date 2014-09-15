package miniProject.dto;



public class Student
{
		private int studentID;
		private String name;
		private int branchLocation;
		
		public Student(){
		}
		
		public int getStudentID() {
			return studentID;
		}

		public String getName() {
			return name;
		}

		public int getBranchLocation() {
			return branchLocation;
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
