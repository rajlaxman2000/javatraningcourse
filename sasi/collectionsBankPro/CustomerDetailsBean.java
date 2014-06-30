package collectionsBankPro;

public class CustomerDetailsBean {
private String fname;
private String lname;
//private int listref;
/**
 * @param fname
 * @param lname
 * @param listref
 */
public CustomerDetailsBean(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
	//this.listref = listref;
}
/**
 * @return the fname
 */
public String getFname() {
	return fname;
}
/**
 * @param fname the fname to set
 */
public void setFname(String fname) {
	this.fname = fname;
}
/**
 * @return the lname
 */
public String getLname() {
	return lname;
}
/**
 * @param lname the lname to set
 */
public void setLname(String lname) {
	this.lname = lname;
}

/**
 * @return the listref
 *//*
public int getListref() {
	return listref;
}
/**
 * @param listref the listref to set
 */
/*public void setListref(int listref) {
	this.listref = listref;
}*/

}
