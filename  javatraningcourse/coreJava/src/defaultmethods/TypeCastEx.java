package defaultmethods;

public class TypeCastEx {

	public static void main(String[] args){
		Parent parent = new Parent();
		
		parent.printGenaralMethod();
		parent.printParentMethod();
		
		Child child = new Child();
		child.printGenaralMethod();
		child.printChildMethod();
		
		parent = child;
		
		Child child2 = (Child)parent;
		Parent parent2=(Parent)child;
		child2.printChildMethod();
		parent2.printGenaralMethod();
		
		
	}
}
