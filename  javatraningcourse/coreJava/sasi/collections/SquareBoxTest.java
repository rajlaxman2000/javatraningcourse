package collections;

public class SquareBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareBox box1 = new SquareBox(10);
		SquareBox box2 = new SquareBox(20);
		SquareBoxTest boxTest = new SquareBoxTest();
		System.out.println(box1.compareTo(box2));
		//System.out.println(boxTest.compr(box1, box2));
		//System.out.println(box2.getSide());
		
	}

	public int compr(SquareBox a, SquareBox b) {
		b.setSide(5);
		if (a.calculateArea() > b.calculateArea())
			return 1;
		else if (a.calculateArea() < b.calculateArea())
			return -1;
		else
			return 0;

	}
}
