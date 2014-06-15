package collectionsBankPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.ListUI;

public class CustomerAcList {
	public static void main(String[] args) {
		ArrayList<CustomarBeanList> cust1 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c1ac1 = new CustomarBeanList("savings", 1102);
		CustomarBeanList c1ac2 = new CustomarBeanList("checking", 1101);
		CustomarBeanList c1ac3 = new CustomarBeanList("current", 1105);
		CustomarBeanList c1ac4 = new CustomarBeanList("fd", 1103);
		CustomarBeanList c1ac5 = new CustomarBeanList("demat", 1104);
		cust1.add(c1ac1);
		cust1.add(c1ac2);
		cust1.add(c1ac3);
		cust1.add(c1ac4);
		cust1.add(c1ac5);
		/*
		 * Collections.sort(cust1); for (CustomarBeanList cust : cust1) {
		 * System.out.println("Acount Type:" + cust.getAcType()+"Acount Type:" +
		 * cust.getAcNo()+"\n"); }
		 */
		ArrayList<CustomarBeanList> cust2 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c2ac1 = new CustomarBeanList("savings", 1201);
		CustomarBeanList c2ac2 = new CustomarBeanList("checking", 1202);
		CustomarBeanList c2ac3 = new CustomarBeanList("current", 1203);
		CustomarBeanList c2ac4 = new CustomarBeanList("fd", 1204);
		CustomarBeanList c2ac5 = new CustomarBeanList("demat", 1205);
		cust2.add(c2ac1);
		cust2.add(c2ac2);
		cust2.add(c2ac3);
		cust2.add(c2ac4);
		cust2.add(c2ac5);
		ArrayList<CustomarBeanList> cust3 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c3ac1 = new CustomarBeanList("savings", 1302);
		CustomarBeanList c3ac2 = new CustomarBeanList("checking", 1301);
		CustomarBeanList c3ac3 = new CustomarBeanList("current", 1305);
		CustomarBeanList c3ac4 = new CustomarBeanList("fd", 1303);
		CustomarBeanList c3ac5 = new CustomarBeanList("demat", 1304);
		cust3.add(c3ac1);
		cust3.add(c3ac2);
		cust3.add(c3ac3);
		cust3.add(c3ac4);
		cust3.add(c3ac5);
		ArrayList<CustomarBeanList> cust4 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c4ac1 = new CustomarBeanList("savings", 1401);
		CustomarBeanList c4ac2 = new CustomarBeanList("checking", 1402);
		CustomarBeanList c4ac3 = new CustomarBeanList("current", 1403);
		CustomarBeanList c4ac4 = new CustomarBeanList("fd", 1404);
		CustomarBeanList c4ac5 = new CustomarBeanList("demat", 1405);
		cust4.add(c4ac1);
		cust4.add(c4ac2);
		cust4.add(c4ac3);
		cust4.add(c4ac4);
		cust4.add(c4ac5);
		ArrayList<CustomarBeanList> cust5 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c5ac1 = new CustomarBeanList("savings", 1501);
		CustomarBeanList c5ac2 = new CustomarBeanList("checking", 1502);
		CustomarBeanList c5ac3 = new CustomarBeanList("current", 1503);
		CustomarBeanList c5ac4 = new CustomarBeanList("fd", 1504);
		CustomarBeanList c5ac5 = new CustomarBeanList("demat", 1505);
		cust5.add(c5ac1);
		cust5.add(c5ac2);
		cust5.add(c5ac3);
		cust5.add(c5ac4);
		cust5.add(c5ac5);
		ArrayList<CustomarBeanList> cust6 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c6ac1 = new CustomarBeanList("savings", 1601);
		CustomarBeanList c6ac2 = new CustomarBeanList("checking", 1602);
		CustomarBeanList c6ac3 = new CustomarBeanList("current", 1603);
		CustomarBeanList c6ac4 = new CustomarBeanList("fd", 1604);
		CustomarBeanList c6ac5 = new CustomarBeanList("demat", 1605);
		cust6.add(c6ac1);
		cust6.add(c6ac2);
		cust6.add(c6ac3);
		cust6.add(c6ac4);
		cust6.add(c6ac5);
		ArrayList<CustomarBeanList> cust7 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c7ac1 = new CustomarBeanList("savings", 1701);
		CustomarBeanList c7ac2 = new CustomarBeanList("checking", 1702);
		CustomarBeanList c7ac3 = new CustomarBeanList("current", 1703);
		CustomarBeanList c7ac4 = new CustomarBeanList("fd", 1704);
		CustomarBeanList c7ac5 = new CustomarBeanList("demat", 1705);
		cust7.add(c7ac1);
		cust7.add(c7ac2);
		cust7.add(c7ac3);
		cust7.add(c7ac4);
		cust7.add(c7ac5);
		ArrayList<CustomarBeanList> cust8 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c8ac1 = new CustomarBeanList("savings", 1801);
		CustomarBeanList c8ac2 = new CustomarBeanList("checking", 1802);
		CustomarBeanList c8ac3 = new CustomarBeanList("current", 1803);
		CustomarBeanList c8ac4 = new CustomarBeanList("fd", 1804);
		CustomarBeanList c8ac5 = new CustomarBeanList("demat", 1805);
		cust8.add(c8ac1);
		cust8.add(c8ac2);
		cust8.add(c8ac3);
		cust8.add(c8ac4);
		cust8.add(c8ac5);
		ArrayList<CustomarBeanList> cust9 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c9ac1 = new CustomarBeanList("savings", 1901);
		CustomarBeanList c9ac2 = new CustomarBeanList("checking", 1902);
		CustomarBeanList c9ac3 = new CustomarBeanList("current", 1903);
		CustomarBeanList c9ac4 = new CustomarBeanList("fd", 1904);
		CustomarBeanList c9ac5 = new CustomarBeanList("demat", 1905);
		cust9.add(c9ac1);
		cust9.add(c9ac2);
		cust9.add(c9ac3);
		cust9.add(c9ac4);
		cust9.add(c9ac5);
		ArrayList<CustomarBeanList> cust10 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c10ac1 = new CustomarBeanList("savings", 2021);
		CustomarBeanList c10ac2 = new CustomarBeanList("checking", 2022);
		CustomarBeanList c10ac3 = new CustomarBeanList("current", 2023);
		CustomarBeanList c10ac4 = new CustomarBeanList("fd", 2024);
		CustomarBeanList c10ac5 = new CustomarBeanList("demat", 2025);
		cust10.add(c10ac1);
		cust10.add(c10ac2);
		cust10.add(c10ac3);
		cust10.add(c10ac4);
		cust10.add(c10ac5);
		CustomerAcList cac;
		List<CustomerDetailsBean> custdet1 = new ArrayList<CustomerDetailsBean>();
		CustomerDetailsBean c1custdata1 = new CustomerDetailsBean("sasikanth",
				"Dale");
		custdet1.add(c1custdata1);
		 //List<CustomarBeanList> newList=new ArrayList<CustomarBeanList>(custdet1);
		for (CustomerDetailsBean cus1 : custdet1)
			System.out.println("First Name: " + cus1.getFname()
					+ " last name: " + cus1.getLname() + " Acount Type: "
					+ c1ac1.getAcNo());
	}
}
