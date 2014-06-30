package immutable;

public class ImmutableTest {
public static void main(String[] args) {
	int total=240;
	ImmutableClass imm =new ImmutableClass();
	imm.givOut();

	System.out.println((float)(total*imm.div)/imm.total);
	
}
}
