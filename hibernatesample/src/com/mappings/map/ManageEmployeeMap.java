package com.mappings.map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageEmployeeMap {

	private static SessionFactory factory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		ManageEmployeeMap manageEmployeeMap = new ManageEmployeeMap();

		Map<String, Certificate> certificatesMap1 = new HashMap<String, Certificate>();

		certificatesMap1.put("ComputerScience", new Certificate("MCA"));
		certificatesMap1.put("BusinessManagement", new Certificate("MBA"));
		certificatesMap1.put("ProjectManagement", new Certificate("PMP"));

		Employee employee = new Employee("Manoj", "Kumar", 4000);
		employee.setCertificates(certificatesMap1);
		/* Add employee records in the database */
		Integer empID = manageEmployeeMap.addEmployee(employee);

		manageEmployeeMap.listEmployees();

		//manageEmployeeMap.updateEmployee(empID, 10000);

		//manageEmployeeMap.listEmployees();

	}

	public void listEmployees() {

		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list();

			for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
				
				Map<String, Certificate> certificates = employee.getCertificates();
				System.out.println("Certificate: "+ (( certificates.get("ComputerScience")).getName()));
				System.out.println("Certificate: "+ (( certificates.get("BusinessManagement")).getName()));
				System.out.println("Certificate: "+ (( certificates.get("ProjectManagement")).getName()));
				
				
			}

			tx.commit();
		} catch (HibernateException hibernateException) {
			if (tx != null)
				tx.rollback();
			hibernateException.printStackTrace();
		} finally {
			session.close();
		}

	}

	/**
	 * @param employee
	 * @return created employee id
	 */
	public Integer addEmployee(Employee employee) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer empdId = null;
		try {
			tx = session.beginTransaction();
			empdId = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException hibernateException) {
			if (tx != null)
				tx.rollback();
			hibernateException.printStackTrace();
		} finally {
			session.close();
		}
		return empdId;
	}

}
