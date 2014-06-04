package defaultmethods;

public class Student {
	
	public String name;
	
	public int no;
	
	public Student(String name, int no){
		this.name=name;
		this.no=no;
	}
	
	public String toString(){
		return "name="+this.name+"; No:"+this.no;
	}
	
	

}
