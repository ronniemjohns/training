package com.javabrains.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.hibernate.entity.Address;
import com.javabrains.hibernate.entity.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		
		//user.setUserId(1);
		user.setUserName("User 1");
		user.setJoinedDate(new Date());
		user.setDescription("Description of user 1");
		Address address = new Address();
		address.setStreet("1907 Blah drive");
		address.setCity("Wylie");
		address.setState("TX");
		address.setZipCode("75098");
		
		user.setAddress(address);
		
		Address workAddress = new Address();
		workAddress.setStreet("1950 Stemmons Frwy");
		workAddress.setCity("Dallas");
		workAddress.setState("TX");
		workAddress.setZipCode("75074");
		
		user.setWorkAddress(workAddress);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		// save a user
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();		
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
		// retrieve a user
		user = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();		
			user = session.get(UserDetails.class, 1);  // no SQL statement since we're getting it straight from the id
			System.out.println(user.getDescription());
			System.out.println(user.getUserId());
			System.out.println(user.getAddress().getStreet());
			System.out.println(user.getWorkAddress().getStreet());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
		
		
		

	}

}
