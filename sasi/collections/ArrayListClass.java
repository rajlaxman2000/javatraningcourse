package collections;

import java.util.Comparator;

public class ArrayListClass implements Comparable<ArrayListClass>,
		Comparator<ArrayListClass> {
	private int id;
	private int no;
	private String name;

	/**
	 * @param id
	 * @param name
	 */
	public ArrayListClass(int id, int no, String name) {
		this.id = id;
		this.no = no;
		this.name = name;
	}

	@Override
	public int compare(ArrayListClass o1, ArrayListClass o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(ArrayListClass o) {
		int mat = this.id - o.getId();
		if (mat < 0)
			return -1;
		else if (mat == 0)
			return 0;
		else
			return 1;

	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no
	 *            the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
