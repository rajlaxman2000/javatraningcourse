
public class Statclasstest {

	public static int x = 10;

	public static String y = "abcd";

	public int z = 5;

	public static void classtest() {
		System.out.println("static method");
	}

	public static class StatClass {
		int k = 30;

		public void print() {
			System.out.println("am nested class but static");
			System.out.println("static x=" + x);
			/* System.out.println("z="+z); */
			System.out.println("static string y=" + y);
		}
	}

	public class RegClass {
		int l = 32;

		public void take() {
			System.out.println("am regular nested class");
			Statclasstest.x = 20;
			System.out.println("x=" + x);
			System.out.println("z=" + z);
		}

	}
}
