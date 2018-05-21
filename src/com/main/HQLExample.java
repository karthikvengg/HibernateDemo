package com.main;

import com.beans.DepartmentBean;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLExample {

	public static void main(String[] args) {
		
		/**
		 * Steps:
		 * 1.Configure
		 * 2.Build Session Factory
		 * 3.Create Session
		 * 4.Create HQL Query
		 * 5.Execute query
		 * 6. View results
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

		String hqlQuery = "FROM DepartmentBean";
		
		Query<DepartmentBean> queryObj = session.createQuery(hqlQuery);
		
		List<DepartmentBean> departmentList = queryObj.list();
		
		for(DepartmentBean d: departmentList)
			System.out.println("Department = " + d);
		
		hqlQuery = "select E.empName from com.beans.EmployeeBean as E where empId = 1"; // Prone to SQL Injection. Not recommended
		
		hqlQuery = "select E.empName from com.beans.EmployeeBean as E where empId = :tempId";
		
		
		
		Query<String> queryObj2 = session.createQuery(hqlQuery);
		queryObj2.setParameter("tempId", Integer.parseInt("1"));
		
		List<String> empList = queryObj2.list();
		
		System.out.println(empList);
	}

}
