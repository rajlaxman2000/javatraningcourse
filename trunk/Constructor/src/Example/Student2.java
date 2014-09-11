package Example;

public class Student2 extends Student{

 private String marks;
 private String grade;
 
 public Student2(){
		
	}
	
	public Student2(String marks){
		this.marks = marks;		
	}
	
	public Student2(String marks, String grade){
		this.marks = marks;	
		this.grade=grade;
	}
	
	public Student2(int id, String name, int age, String marks, String grade){
		
		super(id, age, name);
		this.marks = marks;
		this.grade = grade;

	}
	public String toString(){
	System.out.println(super.toString());
		return "Marks:"+ marks+"Grade:"+ grade;
	}


	public String getmarks() {
		return marks;
	}

	
	public void setSchoolName(String marks) {
		this.marks = marks;
	}

	
	public String getgrade() {
		return grade;
	}

	
	public void setClassName(String className) {
		this.grade = grade;
	}
 
		
	}


