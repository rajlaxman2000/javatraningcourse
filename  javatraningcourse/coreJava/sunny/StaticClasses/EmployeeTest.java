package StaticClasses;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj=new Employee();
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		obj.Employee(16, "sunny");
		obj1.Employee(23, "Anil");
		obj2.Employee(16,"sunny");
		obj.toString();
		obj.hashCode();
		
		if(obj.empName.equalsIgnoreCase(obj1.empName)){
			System.out.println("employee and employee1 names are Equal");
		}
		else if(obj.empName.equalsIgnoreCase(obj2.empName)){
			System.out.println("employee and employee2 names are Equal");
		}else if(obj1.empName.equalsIgnoreCase(obj2.empName)){
			System.out.println("employee1 and employee2 names are Equal");
		}else
		System.out.println("All three names are Not same");
		
		
		System.out.println("Now testing employee ID'S...");
		if(obj.empId==obj1.empId){
			System.out.println("employee and employee1 IDS are Equal");
		}else if(obj.empId==obj2.empId){
			System.out.println("employee and employee2 IDS are Equal");
		}else if(obj1.empId==obj2.empId){
			System.out.println("employee and employee2 IDS are Equal");
		}else
			System.out.println("All three IDS are different");
		
	}
}
