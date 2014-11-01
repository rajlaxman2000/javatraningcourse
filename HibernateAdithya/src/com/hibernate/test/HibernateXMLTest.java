package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.adithya.dto.Employee;


public class HibernateXMLTest {

	public static SessionFactory factory;
	
	public static void main(String[] args) {
		Session session = null;Transaction tx = null;
		try{
			Configuration configuration = new Configuration();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());
		session = factory.openSession();
		session.beginTransaction();
		
		
		List<?> employees = session.createQuery("FROM Employee").list();
		
		for(Iterator<?> iterator = employees.iterator();iterator.hasNext();) {
			Employee emp = (Employee) iterator.next();
			
			System.out.println("id: "+emp.getId());
			System.out.println("first: "+emp.getFirstName());
			System.out.println("last: "+emp.getLastName());
			System.out.println("sal: "+emp.getSalary());
		}
		tx.commit();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}finally{session.close();}

	}

}
