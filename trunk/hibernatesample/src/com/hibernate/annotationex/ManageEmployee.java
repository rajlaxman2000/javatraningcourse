package com.hibernate.annotationex;


//import java.util.Iterator;
//import java.util.List;
import org.hibernate.HibernateException;
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
		 Integer empID1 = ME.addEmployee(0, "SASI", "Samudrala", 25000); 
		

		//System.out.println("*****************After insertion*******************");

		/* List down all the employees */
		//ME.listEmployees();
/*
		System.out.println("Deleteing the data with employee id :: " + 79);
		ME.deleteEmployee(79);

	    System.out.println("Updating the employee salary fo employee id 79"); 
		ME.updateEmployee(79, 123454);
		 
*/
		//System.out.println("************************Table entires after updating the data****************");
		/* List down all the employees */
		//ME.listEmployees();

	}

	/* Method to add an employee record in the database */
	public Integer addEmployee(int id, String fname, String lname, int salary) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx = session.beginTransaction();
			Employee employee;
			if(id==0){
				employee = new Employee(fname, lname, salary);
			}else{
				employee = new Employee(id,fname, lname, salary);
			}
				
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
	 * Method to list all the employees detail
	 */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Employee employee = (Employee) session.get(Employee.class,1);

			
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/*
	 * Method to update salary for an employee
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

	/*
	 * Method to delete an employee from the records
	 */
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