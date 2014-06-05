package defaultmethods;

public class TypeCastEx {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Parent parent = new Parent();
		
		parent.printGenaralMethod();
		parent.printParentMethod();
		
		Child child = new Child();
		child.printGenaralMethod();
		child.printChildMethod();
		
		parent = child;
		
		Child child2 = (Child)parent;
		Parent parent2=(Parent)child;// y can it be done ?
		child2.printChildMethod();
		parent2.printGenaralMethod();
		
		
	}
}
