package com.hibernate.sample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.sample.Employee;

public class ManageEmployee {

	private static SessionFactory factory;

	public static void main(String[] args) {
		
		try {
			
			Configuration configuration = new Configuration();
			factory = configuration.configure().buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);			
		}
		
		ManageEmployee manageEmployee = new ManageEmployee();


		System.out.println("***************** This is to list the data from employee table *******************");
		/* List down all the employees */
		manageEmployee.listEmployees();
		
	}

	

	/**
	 * Method to READ all the employees
	 */
	public void listEmployees() {

		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			List<?> employees = session.createQuery("FROM Employee").list();

			for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {

				Employee employee = (Employee) iterator.next();

				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
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

	

}