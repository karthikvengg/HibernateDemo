package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.DepartmentBean;
import com.beans.EmployeeBean;

public class HibernateDemo {

	public static void main(String[] args) {
		/**
		 * Steps:
		 * 1.Configure
		 * 2.Build Session Factory
		 * 3.Create Session
		 * 4.Begin Transaction
		 * 5.Create Employee object
		 * 6.Do transaction
		 */ 
		
		//Step-1: Configure Hibernate		
		System.out.println("Configured Hibernate.");
		Configuration config = new Configuration().configure();
		
		//Step-2: Create SessionFactory Object.		
		System.out.println("Created SessionFactory object.");
		SessionFactory factory = config.buildSessionFactory();
		
		//Step-3: Create Session Object.		
		System.out.println("Created Session object.");
		Session session = factory.openSession();
				
		//Step-4: Begin Transaction
		System.out.println("Begining Transaction");
		Transaction transcation = session.beginTransaction();
		
		System.out.println("Creating Employee object");
		EmployeeBean emp = new EmployeeBean(0, "Karthik", 25000);
		DepartmentBean dep = new DepartmentBean(1,"IT","Chennai");
		
		System.out.println("Save Employee Object");
		session.save(dep);
		
		System.out.println("Commit Transaction");
		transcation.commit();
		
		session.close();					

	}
}
