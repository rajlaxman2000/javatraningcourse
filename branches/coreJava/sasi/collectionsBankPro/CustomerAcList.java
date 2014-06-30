package collectionsBankPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.plaf.ListUI;

public class CustomerAcList {
	public static void main(String[] args) {
		ArrayList<CustomarBeanList> cust1 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c1ac1 = new CustomarBeanList("savings", 1102,"ranga","lala");
		CustomarBeanList c1ac2 = new CustomarBeanList("checking", 1101,"ranga","lala");
		CustomarBeanList c1ac3 = new CustomarBeanList("current", 1105,"ranga","lala");
		CustomarBeanList c1ac4 = new CustomarBeanList("fd", 1103,"ranga","lala");
		CustomarBeanList c1ac5 = new CustomarBeanList("demat", 1104,"ranga","lala");
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
		CustomarBeanList c2ac1 = new CustomarBeanList("savings", 1201,"sukan","loco");
		CustomarBeanList c2ac2 = new CustomarBeanList("checking", 1202,"sukan","loco");
		CustomarBeanList c2ac3 = new CustomarBeanList("current", 1203,"sukan","loco");
		CustomarBeanList c2ac4 = new CustomarBeanList("fd", 1204,"sukan","loco");
		CustomarBeanList c2ac5 = new CustomarBeanList("demat", 1205,"sukan","loco");
		cust2.add(c2ac1);
		cust2.add(c2ac2);
		cust2.add(c2ac3);
		cust2.add(c2ac4);
		cust2.add(c2ac5);
		ArrayList<CustomarBeanList> cust3 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c3ac1 = new CustomarBeanList("savings", 1302,"varuk","kiko");
		CustomarBeanList c3ac2 = new CustomarBeanList("checking", 1301,"varuk","kiko");
		CustomarBeanList c3ac3 = new CustomarBeanList("current", 1305,"varuk","kiko");
		CustomarBeanList c3ac4 = new CustomarBeanList("fd", 1303,"varuk","kiko");
		CustomarBeanList c3ac5 = new CustomarBeanList("demat", 1304,"varuk","kiko");
		cust3.add(c3ac1);
		cust3.add(c3ac2);
		cust3.add(c3ac3);
		cust3.add(c3ac4);
		cust3.add(c3ac5);
		ArrayList<CustomarBeanList> cust4 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c4ac1 = new CustomarBeanList("savings", 1401,"silva","lanka");
		CustomarBeanList c4ac2 = new CustomarBeanList("checking", 1402,"silva","lanka");
		CustomarBeanList c4ac3 = new CustomarBeanList("current", 1403,"silva","lanka");
		CustomarBeanList c4ac4 = new CustomarBeanList("fd", 1404,"silva","lanka");
		CustomarBeanList c4ac5 = new CustomarBeanList("demat", 1405,"silva","lanka");
		cust4.add(c4ac1);
		cust4.add(c4ac2);
		cust4.add(c4ac3);
		cust4.add(c4ac4);
		cust4.add(c4ac5);
		ArrayList<CustomarBeanList> cust5 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c5ac1 = new CustomarBeanList("savings", 1501,"kuran","kaka");
		CustomarBeanList c5ac2 = new CustomarBeanList("checking", 1502,"kuran","kaka");
		CustomarBeanList c5ac3 = new CustomarBeanList("current", 1503,"kuran","kaka");
		CustomarBeanList c5ac4 = new CustomarBeanList("fd", 1504,"kuran","kaka");
		CustomarBeanList c5ac5 = new CustomarBeanList("demat", 1505,"kuran","kaka");
		cust5.add(c5ac1);
		cust5.add(c5ac2);
		cust5.add(c5ac3);
		cust5.add(c5ac4);
		cust5.add(c5ac5);
		ArrayList<CustomarBeanList> cust6 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c6ac1 = new CustomarBeanList("savings", 1601,"altaf","duci");
		CustomarBeanList c6ac2 = new CustomarBeanList("checking", 1602,"altaf","duci");
		CustomarBeanList c6ac3 = new CustomarBeanList("current", 1603,"altaf","duci");
		CustomarBeanList c6ac4 = new CustomarBeanList("fd", 1604,"altaf","duci");
		CustomarBeanList c6ac5 = new CustomarBeanList("demat", 1605,"altaf","duci");
		cust6.add(c6ac1);
		cust6.add(c6ac2);
		cust6.add(c6ac3);
		cust6.add(c6ac4);
		cust6.add(c6ac5);
		ArrayList<CustomarBeanList> cust7 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c7ac1 = new CustomarBeanList("savings", 1701,"dulese","lilola");
		CustomarBeanList c7ac2 = new CustomarBeanList("checking", 1702,"dulese","lilola");
		CustomarBeanList c7ac3 = new CustomarBeanList("current", 1703,"dulese","lilola");
		CustomarBeanList c7ac4 = new CustomarBeanList("fd", 1704,"dulese","lilola");
		CustomarBeanList c7ac5 = new CustomarBeanList("demat", 1705,"dulese","lilola");
		cust7.add(c7ac1);
		cust7.add(c7ac2);
		cust7.add(c7ac3);
		cust7.add(c7ac4);
		cust7.add(c7ac5);
		ArrayList<CustomarBeanList> cust8 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c8ac1 = new CustomarBeanList("savings", 1801,"flower","anti");
		CustomarBeanList c8ac2 = new CustomarBeanList("checking", 1802,"flower","anti");
		CustomarBeanList c8ac3 = new CustomarBeanList("current", 1803,"flower","anti");
		CustomarBeanList c8ac4 = new CustomarBeanList("fd", 1804,"flower","anti");
		CustomarBeanList c8ac5 = new CustomarBeanList("demat", 1805,"flower","anti");
		cust8.add(c8ac1);
		cust8.add(c8ac2);
		cust8.add(c8ac3);
		cust8.add(c8ac4);
		cust8.add(c8ac5);
		ArrayList<CustomarBeanList> cust9 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c9ac1 = new CustomarBeanList("savings", 1901,"austin","bulldog");
		CustomarBeanList c9ac2 = new CustomarBeanList("checking", 1902,"austin","bulldog");
		CustomarBeanList c9ac3 = new CustomarBeanList("current", 1903,"austin","bulldog");
		CustomarBeanList c9ac4 = new CustomarBeanList("fd", 1904,"austin","bulldog");
		CustomarBeanList c9ac5 = new CustomarBeanList("demat", 1905,"austin","bulldog");
		cust9.add(c9ac1);
		cust9.add(c9ac2);
		cust9.add(c9ac3);
		cust9.add(c9ac4);
		cust9.add(c9ac5);
		ArrayList<CustomarBeanList> cust10 = new ArrayList<CustomarBeanList>();
		CustomarBeanList c10ac1 = new CustomarBeanList("savings", 2021,"swamy","zexol");
		CustomarBeanList c10ac2 = new CustomarBeanList("checking", 2022,"swamy","zexol");
		CustomarBeanList c10ac3 = new CustomarBeanList("current", 2023,"swamy","zexol");
		CustomarBeanList c10ac4 = new CustomarBeanList("fd", 2024,"swamy","zexol");
		CustomarBeanList c10ac5 = new CustomarBeanList("demat", 2025,"swamy","zexol");
		cust10.add(c10ac1);
		cust10.add(c10ac2);
		cust10.add(c10ac3);
		cust10.add(c10ac4);
		cust10.add(c10ac5);
		CustomerAcList cac;
/*		for (CustomarBeanList cus1 :cust2)
			System.out.println("First Name: " + cus1.getFname()
					+ " last name: " + cus1.getLname() + " Acount Type: "
					+ cus1.getAcType()+" Ac No: "+cus1.getAcNo());*/
		Map<String, CustomarBeanList> keymp=new TreeMap<String, CustomarBeanList>();
		/*keymp.put(cust1.toString(), cust1);
		System.out.println(keymp);*/
	}
}
