package com.hibernate.caching;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.caching.Employee;

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

			Employee employee = (Employee)session.get(Employee.class, 17);
			
				System.out.print("Emp Id: " + employee.getId());
				System.out.print("; First Name: " + employee.getFirstName());
				System.out.print("; Last Name: " + employee.getLastName());
				System.out.println("; Salary: " + employee.getSalary());
				
			Employee employee2 = (Employee)session.get(Employee.class, 17);
				System.out.print("Emp Id: " + employee2.getId());
				System.out.print("; First Name: " + employee2.getFirstName());
				System.out.print("; Last Name: " + employee2.getLastName());
				System.out.println("; Salary: " + employee2.getSalary());
				tx.commit();
				session.close();
				
			System.out.println("******************************* Second Session Started  *******************************");
				Session session2 = factory.openSession();
				
					Employee employee3 = (Employee)session2.get(Employee.class, 17);
				session2.close();
				
			/*
			for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {

				Employee employee = (Employee) iterator.next();
				System.out.print("Emp Id: " + employee.getId());
				System.out.print("; First Name: " + employee.getFirstName());
				System.out.print("; Last Name: " + employee.getLastName());
				System.out.println("; Salary: " + employee.getSalary());
			}
			*/
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			
		}
	}

	

}