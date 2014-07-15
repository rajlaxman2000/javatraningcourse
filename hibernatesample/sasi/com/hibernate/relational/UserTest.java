package com.hibernate.relational;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserTest {
static SessionFactory factory;
	public static void main(String[] args) {
UserTest userTest= new UserTest();
		try{
		factory= new Configuration().configure().buildSessionFactory(); 
	}catch(HibernateException e){
		System.err.println("Factory not build"+e);
	}
		userTest.display();
	
}
	public void display(){
		Session session=factory.openSession();
		session.beginTransaction();
		List<UserBean> user= session.createQuery("From UserBean").list();
		for(Iterator<UserBean>itr=user.iterator(); itr.hasNext();){
			UserBean userBean=(UserBean)itr.next();
			System.out.println("First Name:"+userBean.getFirst_name());
			System.out.println("Last Name:"+userBean.getLast_name());
			List<CertificateBean>cer=userBean.getCert();
			for(Iterator<CertificateBean>cerBean=cer.iterator();cerBean.hasNext();){
				CertificateBean certb=(CertificateBean)cerBean.next();
				System.out.println("Certificate:" +certb.getName());
				
			}
		}
	}
}
