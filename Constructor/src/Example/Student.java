package Example;



public class Student {
	
	private int id;
	
	private String name;
	
	private int age;	
	
	
	
	public Student(){
		
	}
	
	public Student(int id){
		
		this.id=id;
	}

	public Student(int id,  int age , String name) {
		this.id = id;
		
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return "Student Id:"+id+"; Name:"+name+"; Age:"+age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

public static void main(String[] args) {
		
		/*Student1 Studenta=new Student1(9, 22, "deepu", "ro-23");
		System.out.println(Studenta);
		*/
		
		Student2 Studentb=new Student2("99","A");
		System.out.println(Studentb);
		}	
}

