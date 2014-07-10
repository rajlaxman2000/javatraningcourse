package com.mapping.sortedset;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmployeeSortedSet {

	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		ManageEmployeeSortedSet ME = new ManageEmployeeSortedSet();

		/* Let us have a set of certificates for the first employee */
		TreeSet<Certificate> certificateSet1 = new TreeSet<Certificate>();
		certificateSet1.add(new Certificate("MCA"));
		certificateSet1.add(new Certificate("MBA"));
		certificateSet1.add(new Certificate("PMP"));
		/* Add employee records in the database */
		Integer empId1 = ME.addEmployee("Manoj", "Kumar", 4000, certificateSet1);

		/* Another set of certificates for the second employee */
		TreeSet<Certificate> certificateSet2 = new TreeSet<Certificate>();
		certificateSet2.add(new Certificate("BCA"));
		certificateSet2.add(new Certificate("BA"));
		/* Add another employee record in the database */
		Integer empId2 = ME.addEmployee("Dilip", "Kumar", 3000, certificateSet2);

		/* List down all the employees */
		 ME.listEmployees();
		/* Update employee's salary records */
		 ME.updateEmployee(empId1, 5000);
		/* Delete an employee from the database */
		ME.deleteEmployee(empId2);
		/* List down all the employees */
		 ME.listEmployees();

	}

	/* Method to add an employee record in the database */
	public Integer addEmployee(String fname, String lname, int salary,SortedSet<Certificate> cert) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			Employee employee = new Employee(fname, lname, salary);
			employee.setCertificates(cert);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}

	/* Method to list all the employees detail */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list();
			for (Iterator<Employee> iterator1 = employees.iterator(); iterator1
					.hasNext();) {
				Employee employee = (Employee) iterator1.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
				SortedSet<Certificate> certificates = employee.getCertificates();
				for (Iterator<Certificate> iterator2 = certificates.iterator(); iterator2.hasNext();) {
					Certificate certName = (Certificate) iterator2.next();
					System.out.println("Certificate: " + certName.getName());
				}
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to update salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class,EmployeeID);
			employee.setSalary(salary);
			Certificate certificate = (Certificate) session.get(Certificate.class, 26);
			certificate.setName("AGB");
			employee.getCertificates().add(certificate);			
			session.update(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to delete an employee from the records */
	public void deleteEmployee(Integer EmployeeID) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class,EmployeeID);
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
