package com.javabrains.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.hibernate.entity.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		
		userDetails.setUserId(1);
		userDetails.setUserName("User 1");
		userDetails.setAddress("First user's address.");
		userDetails.setJoinedDate(new Date());
		userDetails.setDescription("Description of user 1");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();		
		session.save(userDetails);
		session.getTransaction().commit();
		

	}

}
