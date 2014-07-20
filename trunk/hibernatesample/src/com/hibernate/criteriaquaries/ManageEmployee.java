package com.hibernate.criteriaquaries;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
			tx = session.beginTransaction();

			/*
			 * Restrictions : eq, gt, lt, like, between, isNull, isNotNull, isEmpty
			 * Order
			 * Projections 
			 * 
			 */
			
			Criteria cr = session.createCriteria(Employee.class);
			
			/*
			cr.add(Restrictions.eq("salary", 5000));
			cr.add(Restrictions.ge("salary", 5000));
			cr.add(Restrictions.gt("salary", 5000));
			cr.add(Restrictions.le("salary", 5000));
			cr.add(Restrictions.lt("salary", 5000));
			cr.add(Restrictions.like("lastName", "Kum%"));
			cr.add(Restrictions.between("salary", 5000, 10000));
			cr.add(Restrictions.like("lastName", "Kumar"));
			cr.addOrder(Order.asc("firstName"));
			
			Criterion cr1 = Restrictions.between("salary", 5000, 10000);
			Criterion cr2 = Restrictions.like("lastName", "Kumar");
			
			LogicalExpression orEx  = Restrictions.and(cr1, cr2);
			cr.add(orEx);
			
			List<?> employees = cr.list();
			
			
			for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {				
				
				Employee emp =  (Employee)iterator.next();

				System.out.print("\nFirst Name: " + emp.getFirstName());
				System.out.print(" Last Name: " + emp.getLastName());
				System.out.println(" Salary: " + emp.getSalary());
				
			}
			*/
	
			cr.setProjection(Projections.countDistinct("lastName"));
			
			List<?> employees = cr.list();
			
			
			for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {				
				
				Long cnt =  (Long)iterator.next();
				System.out.println(" Count: " +cnt);
				
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