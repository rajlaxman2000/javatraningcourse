package com.hibernate.application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.Certificate;
import com.hibernate.beans.Employee;

/**
 * @author Rajesh_Duvvi
 * 
 */
public class ManageEmployeeOneToMany {

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
		ManageEmployeeOneToMany ME = new ManageEmployeeOneToMany();

		Set<Certificate> set1 = new HashSet<Certificate>();
		set1.add(new Certificate("MCA"));
		set1.add(new Certificate("MBA"));
		set1.add(new Certificate("PMP"));

		/* Add employee records in the database 
		Integer empID1 = ME.addEmployee("Manoj", "Kumar", 4000, set1);

		System.out.println(empID1);
*/
		/* Another set of certificates for the second employee */
		HashSet set2 = new HashSet();
		set2.add(new Certificate("BCA"));
		set2.add(new Certificate("BA")); 
		
		/* Add another employee record in the database*/
		//Integer empID2 = ME.addEmployee("Dilip", "Kumar", 3000, set2); 
		
		/* List down all the employees */
		ME.listEmployees(); 
	
		/* Update employee's salary records */
		ME.updateEmployee(19, 5000);
		
		/* Delete an employee from the database */
		ME.deleteEmployee(21); 
		
		/* List down all the employees */ 
		ME.listEmployees();

	}

	/* Method to add an employee record in the database */
	public Integer addEmployee(String fname, String lname, int salary,Set<Certificate> certficates) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			Employee employee = new Employee(fname, lname, salary);
			employee.setCertificates(certficates);
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

	private void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list();

			for (Iterator<Employee> empIterator = employees.iterator(); empIterator.hasNext();) {
				Employee employee = (Employee) empIterator.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
				Set<Certificate> certificates = employee.getCertificates();
				
				for (Iterator<Certificate> certificateIterator = certificates.iterator(); certificateIterator.hasNext();) {
					Certificate certName = (Certificate) certificateIterator.next();
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

	private void updateEmployee(Integer EmployeeID, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class,EmployeeID);			
			employee.setSalary(salary);
			Certificate certificate = (Certificate) session.get(Certificate.class,17);
			certificate.setName("MBA-Marketing");					
			employee.getCertificates().add(certificate);
			System.out.println("Printing the certificates for employee before updating, EMp ID: "+employee.getId());
			for (Iterator<Certificate> certificateIterator = employee.getCertificates().iterator(); certificateIterator.hasNext();) {
				Certificate certName = (Certificate) certificateIterator.next();
				System.out.println("Certificate: " + certName.getName());
			}
			
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
	
	private void updateCertificate(Integer certificateId) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Certificate certificate = (Certificate) session.get(Certificate.class,certificateId);
			certificate.setName("MBA-Finance");		
			session.update(certificate);
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
			Employee employee = (Employee) session.get(Employee.class,
					EmployeeID);
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
