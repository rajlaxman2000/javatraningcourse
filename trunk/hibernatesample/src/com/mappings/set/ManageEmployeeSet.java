package com.mappings.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.Certificate;
import com.hibernate.beans.Employee;

public class ManageEmployeeSet {

	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			// factory = new Configuration().configure().buildSessionFactory();

			Configuration configuration = new Configuration();

			factory = configuration.configure().buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		ManageEmployeeSet ME = new ManageEmployeeSet();

		Certificate certificate1 = new Certificate("MBA");
		Certificate certificate2 = new Certificate("OCJP");

		Set<Certificate> certificates = new HashSet<Certificate>();

		certificates.add(certificate1);
		certificates.add(certificate2);

		/* Add few employee records in database */
		Integer empID1 = ME.addEmployee("Karthik", "Samudrala", 15000, certificates);

		System.out
				.println("*****************After insertion*******************");
		/* List down all the employees */
		// ME.listEmployees();

		// System.out.println("Deleteing the data with employee id :: "+empID1);
		// ME.deleteEmployee(empID1);

		System.out.println("Updating the employee salary fo employee id  "
				+ empID1);
		// ME.updateEmployee(empID1, 123454);

		System.out
				.println("************************Table entires after updating the data****************");
		/* List down all the employees */
		// ME.listEmployees();

	}

	/* Method to add an employee record in the database */
	public Integer addEmployee(String fname, String lname, int salary,
			Set<Certificate> certificates) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx = session.beginTransaction();

			Employee employee = new Employee(fname, lname, salary);

			employee.setCertificates(certificates);

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

	/*
	 * Method to list all the employees detail public void listEmployees() {
	 * Session session = factory.openSession(); Transaction tx = null; try { tx
	 * = session.beginTransaction(); List<Employee> employees =
	 * session.createQuery("FROM Employee").list(); for (Iterator<Employee>
	 * iterator1 = employees.iterator(); iterator1 .hasNext();) { Employee
	 * employee = (Employee) iterator1.next(); System.out.print("First Name: " +
	 * employee.getFirstName()); System.out.print(" Last Name: " +
	 * employee.getLastName()); System.out.println(" Salary: " +
	 * employee.getSalary()); SortedSet<Certificate> certificates =
	 * employee.getCertificates(); for (Iterator<Certificate> iterator2 =
	 * certificates.iterator(); iterator2.hasNext();) { Certificate certName =
	 * (Certificate) iterator2.next(); System.out.println("Certificate: " +
	 * certName.getName()); } } tx.commit(); } catch (HibernateException e) { if
	 * (tx != null) tx.rollback(); e.printStackTrace(); } finally {
	 * session.close(); } }
	 */

	/*
	 * Method to update salary for an employee public void
	 * updateEmployee(Integer EmployeeID, int salary) { Session session =
	 * factory.openSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); Employee employee = (Employee)
	 * session.get(Employee.class,EmployeeID); employee.setSalary(salary);
	 * Certificate certificate = (Certificate) session.get(Certificate.class,
	 * 26); certificate.setName("AGB");
	 * employee.getCertificates().add(certificate); session.update(employee);
	 * tx.commit(); } catch (HibernateException e) { if (tx != null)
	 * tx.rollback(); e.printStackTrace(); } finally { session.close(); } }
	 */

	/*
	 * Method to delete an employee from the records public void
	 * deleteEmployee(Integer EmployeeID) { Session session =
	 * factory.openSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); Employee employee = (Employee)
	 * session.get(Employee.class,EmployeeID); session.delete(employee);
	 * tx.commit(); } catch (HibernateException e) { if (tx != null)
	 * tx.rollback(); e.printStackTrace(); } finally { session.close(); } }
	 */
}