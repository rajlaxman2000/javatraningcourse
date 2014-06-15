package collections;

public class StudentForMap implements Comparable<StudentForMap> {
	
	private int id;
	
	private String name;

	
	public boolean equals(Object obj){
		StudentForMap std = (StudentForMap)obj;
		if(	this.id == std.getId() && 
					(this.name).equals(std.getName())	){
			return true;
		}
		
		return false;
	}
	
	public int hashCode(){
		
		return this.id+this.name.hashCode();
	}
	
	
	public String toString(){
		
		return "\n"+"Key=="+" id:"+id+",name:"+name+"  ";
	}
	
	
	/**
	 * @param id
	 * @param name
	 */
	public StudentForMap(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(StudentForMap std) {
		if (this.id>std.getId()){
			return 1;
		}else if(this.id<std.getId()){
			return -1;
		}else{
			return 0;	
		}
		
	}
	
	

}
