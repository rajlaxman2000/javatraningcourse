package defaultmethods;

public class Student {
	
	public String name;
	
	public int no;
	
	public Student(String name, int no){
		this.name=name;
		this.no=no;
	}
	
	public String toString(){
		return "name="+name+"; No:"+this.no;
	}
	
	public int hashCode(){		
		return (name).hashCode()+no;// what if when both the variables are integers
	}								// variable.hashcode() giving the value of variable.
	
	//Super :: Object
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Student/student is child of Object ref, u can use Object members directly, but even it is student reference 
	 * u can't access its members with out type casting
	 */
	public boolean equals(Object obj){
		Student student = (Student)obj;
		
		if(student.name.equalsIgnoreCase(this.name)){
			return true;
		}
		
		return false;
	}
	
	

}
