package com.mappings.sortedmap;

public class Certificate implements Comparable<Certificate> {

	private int id;

	private String name;

	public Certificate() {

	}

	/**
	 * @param id
	 * @param name
	 */
	public Certificate(String name) {
		this.name = name;
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

	@Override
	public int compareTo(Certificate certificate) {
		final int BEFORE = -1;
		final int AFTER = 1;
		if (certificate == null) {
			return BEFORE;
		}
		
		if (this.getName() == null) {
			return AFTER;
		} else if (certificate.getName() == null) {
			return BEFORE;
		} else {
			return this.getName().compareTo(certificate.getName());
		}
	}

}
