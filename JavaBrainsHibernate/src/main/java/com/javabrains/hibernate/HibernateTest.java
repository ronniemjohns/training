package com.javabrains.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.hibernate.entity.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		
		user.setUserId(1);
		user.setUserName("User 1");
		user.setAddress("First user's address.");
		user.setJoinedDate(new Date());
		user.setDescription("Description of user 1");
		
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
		
		
		

	}

}
