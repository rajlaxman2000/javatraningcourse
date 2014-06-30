package defaultsasi;

public class DefaultMethods {
	
	public int a;
	public int b;
	

	public DefaultMethods(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return "Value Of A:" + a + "Value Of B:" + b;
	}

	public int hashCode() {
		return a;

	}
}
