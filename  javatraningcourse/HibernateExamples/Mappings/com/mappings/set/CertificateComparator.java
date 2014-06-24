package com.mappings.set;

import java.util.Comparator;

/**
 * @author Rajesh_Duvvi
 *
 */
public class CertificateComparator implements Comparator<Certificate> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Certificate certificate1, Certificate certificate2) {
		final int BEFORE = -1;
		final int AFTER = 1; 
		
		/* To reverse the sorting order, multiple by -1 */
		if (certificate1 == null) {
			return BEFORE * -1;
		}
		String cert1Name = certificate1.getName();
		String cert2Name = certificate2.getName();
		if (cert1Name == null) {
			return AFTER * 1;
		} else if (cert2Name == null) {
			return BEFORE * -1;
		} else {
			return cert1Name.compareTo(cert2Name) * -1;
		}
	}

}
