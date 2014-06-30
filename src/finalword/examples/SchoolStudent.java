package finalword.examples;

//public class SchoolStudent extends GenericStudent {
	/*The type SchoolStudent cannot subclass the final class GenericStudent */
public class SchoolStudent {
	
	public GenericStudent getstudentDetails(){
		GenericStudent student =  GenericStudent.studentDetails();
		return student;		
	}
	

}
