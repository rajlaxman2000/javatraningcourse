package com.hibernate.caching;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ManageEmployee {

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
		ManageEmployee ME = new ManageEmployee();

		/* Add few employee records in database */
		//Integer empID1 = ME.addEmployee("Giri", "Prasad", 20000);

		System.out.println("*****************After insertion*******************");
		/* List down all the employees */
		ME.listEmployees();

		//System.out.println("Deleteing the data with employee id :: "+empID1);
		//ME.deleteEmployee(empID1);
		
		/*System.out.println("Updating the employee salary fo employee id  "+empID1);*/
		//ME.updateEmployee(95, 5000);
		
		
		//System.out.println("************************Table entires after updating the data****************");
		/* List down all the employees */
		//ME.listEmployees();

	}

	

	/**
	 * Method to READ all the employees
	 */
	public void listEmployees() {

		Session session = factory.openSession();
		Transaction tx = null;
		System.out.println("I am in list method");
		try {
			
			//Second level cache at class/persistent bean level 
			/*
			Employee employee = (Employee) session.get(Employee.class, 96);
			System.out.println("Salary :: "+employee.getSalary());
			session.close();
			
			Session session1 = factory.openSession();			
			Employee employee2 = (Employee) session1.get(Employee.class, 96);		
			session1.close();
			*/
			
		
			
			Query query =  session.createQuery("From Employee where id=96");
			query.setCacheable(true);
			List<?> employees2 = query.list();
			session.close();
			
			Session session1 = factory.openSession();
			Query query2 =  session1.createQuery("From Employee where id=96");
			query2.setCacheable(true);			
			List<?> employees3 = query2.list();
			session1.close();
			
			
		} catch (HibernateException e) {			
			e.printStackTrace();
		} finally {
			
		}
	}

	/**
	 * Method to DELETE an employee from the records
	 * 
	 * @param EmployeeID
	 */
	public void deleteEmployee(Integer EmployeeID) {
		
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
			Employee employee = (Employee) session.get(Employee.class,EmployeeID);
			
					
			//System.out.println("***********I am in delete method ***********");
			//System.out.println(employee);
			
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
	
	/**
	 * Method to UPDATE salary for an employee
	 * @param EmployeeID
	 * @param salary
	 */
	public void updateEmployee(Integer EmployeeID, int salary) {
		
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
		
			tx = session.beginTransaction();
			
			Employee employee = (Employee) session.get(Employee.class,EmployeeID);
			
			employee.setSalary(salary);
			
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
	

}