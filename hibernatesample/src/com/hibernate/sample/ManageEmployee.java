package com.hibernate.sample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.Employee;

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
		Integer empID1 = ME.addEmployee("Hari", "Prasad", 10000);

		System.out.println("*****************After insertion*******************");
		/* List down all the employees */
		ME.listEmployees();

		//System.out.println("Deleteing the data with employee id :: "+empID1);
		//ME.deleteEmployee(empID1);
		
		System.out.println("Updating the employee salary fo employee id  "+empID1);
		ME.updateEmployee(empID1, 123454);
		
		System.out.println("************************Table entires after updating the data****************");
		/* List down all the employees */
		ME.listEmployees();

	}

	/**
	 * Method to CREATE an employee in the database
	 * 
	 * @param fname
	 * @param lname
	 * @param salary
	 * @return
	 */
	public Integer addEmployee(String fname, String lname, int salary) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {

			tx = session.beginTransaction();

			Employee employee = new Employee(fname, lname, salary);

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

	/**
	 * Method to READ all the employees
	 */
	public void listEmployees() {

		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			List<?> employees = session.createQuery("FROM Employee").list();

			for (Iterator<?> iterator = employees.iterator(); iterator
					.hasNext();) {

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