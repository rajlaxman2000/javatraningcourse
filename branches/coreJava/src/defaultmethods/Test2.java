package defaultmethods;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultMethods methods = new DefaultMethods(10, 20);
		DefaultMethods methods2 = new DefaultMethods(10, 30);

		/*
		 * System.out.println(methods.hashCode());
		 * System.out.println(methods.toString());
		 * System.out.println(methods2.hashCode());// y its 10
		 */
		System.out.println(methods.hashCode());
		System.out.println(methods2.hashCode());

	}

}
