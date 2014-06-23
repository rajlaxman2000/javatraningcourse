package storeData;

import java.util.ArrayList;
import java.util.Scanner;

public class DataCenter {
	public static void main(String[] args) {
		int id;
		int arr[] = new int[10];
		int i=1;
		String fname;
		String lname = null;
		String fet = null;
		String loc;
		ArrayList<DataCenterBean> arrayList = new ArrayList<DataCenterBean>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out
					.println("   Menu\n1.Insert Details\n2. Fetch Data\n3.Exit");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Choice:");
			int ch = sc1.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Id: ");
				id = sc.nextInt();
				System.out.println("Enetr First Name: ");
				fname = sc.next();
				System.out.println("Enter Last Name: ");
				lname = sc.next();
				System.out.println("Enter Location: ");
				loc = sc.next();
				while (i != 0) {
					DataCenterBean stu = new DataCenterBean(id, fname, lname,
							loc);
					arrayList.add(stu);
				arr[i]=stu.hashCode();
				i++;
				}
				break;
			case 2:
				System.out.println("Enter Last Name: ");
				fet = sc.next();
				for (DataCenterBean dcb : arrayList) {
					if (fet.equalsIgnoreCase(lname)) {
						System.out.println("id: " + dcb.getId() + " Name: "
								+ dcb.getFname() + " Last Name: "
								+ dcb.getLname() + " Location: "
								+ dcb.getAddress());
					} else
						System.out.println("Not Found...");
				}
				break;
			case 3:
				System.exit(0);
			default:
				System.err.println("Invalid Entry, Enter Valid Digit.....!!");
				break;
			}

		}
	}
}
