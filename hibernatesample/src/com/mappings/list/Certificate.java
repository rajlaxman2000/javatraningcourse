package com.mappings.list;

public class Certificate{

	private int id;
	private String name;

	/**
	 * Default constructor, this i mandatory for Hibernate to treat this class a
	 * persistent class
	 */
	public Certificate() {

	}

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

}
