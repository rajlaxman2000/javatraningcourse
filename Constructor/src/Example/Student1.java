package Example;

public class Student1 extends Student{
	private String studentrollno;
	
	public Student1()
	{
		
	}
public Student1(int id)
	{
		
	}
public Student1(int id,int age)
{
		
}
public Student1(int id,int age, String name, String studentrollno)
{
		super(id,age,name);
		this.studentrollno = studentrollno;
		
}

public String toString(){
	System.out.println(super.toString());
	return "StudentRollno:"+studentrollno;
	
}

public String getStudentrollno() {
	return studentrollno;
}
public void setStudentrollno(String studentrollno) {
	this.studentrollno = studentrollno;
}

}
	

