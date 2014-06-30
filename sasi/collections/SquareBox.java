package collections;

public class SquareBox implements Comparable<SquareBox> {
	private int side;

	public SquareBox(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return this.side * this.side;
	}

	/**
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * @param side
	 *            the side to set
	 */
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int compareTo(SquareBox o) {
		if (this.side < o.getSide())
			return -1;
		else if (this.side > o.getSide())
			return 1;
		else
			return 0;
	}

}
