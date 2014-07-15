package com.hibernate.relational;

import java.util.List;

public class UserBean {
	private int id;
	private String first_name;
	private String last_name;
	List<CertificateBean> cert;

	public UserBean(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name
	 *            the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name
	 *            the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the cert
	 */
	public List<CertificateBean> getCert() {
		return cert;
	}

	/**
	 * @param cert the cert to set
	 */
	public void setCert(List<CertificateBean> cert) {
		this.cert = cert;
	}

}
