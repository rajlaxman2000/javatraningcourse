package inheritance;


public class TypeCast {
	public static void main(String args[]){
	
			Parent parent = new Parent();
			
			parent.printGenaralMethod();
			parent.printParentMethod();
			
			Child child = new Child();
			child.printGenaralMethod();
			child.printChildMethod();
			
			/*parent = child;
			
			Child child2 = (Child)parent;
			child2.printChildMethod();*/
			
			child=parent;
			
			Parent parent1= (Parent)child;
			
			
			

	}

}
