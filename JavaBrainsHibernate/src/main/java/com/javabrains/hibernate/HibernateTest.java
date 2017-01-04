package com.javabrains.hibernate;

import java.util.Date;

import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.hibernate.model.Address;
import com.javabrains.hibernate.model.Contact;
import com.javabrains.hibernate.model.UserDetails;
import com.javabrains.hibernate.model.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		
		//user.setUserId(1);
		user.setUserName("User 1");
		user.setJoinedDate(new Date());
		user.setDescription("Description of user 1");
		
		user.setAddress(getHomeAddress());
		user.setWorkAddress(getWorkAddress());
		
		user.addContact(getHomeContact());
		user.addContact(getWorkContact());		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Main car");
		
		user.setVehicle(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		// save a user
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();		
			session.save(user);
			session.save(vehicle);
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
			user = session.get(UserDetails.class, 1);  // no SQL statement since we're getting it straight from the id
			System.out.println(user.getDescription());
			System.out.println(user.getUserId());
			System.out.println(user.getAddress().getStreet());
			System.out.println(user.getWorkAddress().getStreet());
			for(Contact contact : user.getContacts() ) {
				System.out.println(contact.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		System.out.println("START of lazy fetching.  Note that the SQL will only be to user_details.");
		try {
			user = null;
			session = sessionFactory.openSession();
			user = session.get(UserDetails.class, 1);  // by default, it will NOT get the contacts (stored in a different table)
			session.close();
			System.out.println(user.getContacts().size());  // BUT THIS will cause hibernate to go get it (lazy fetching)
		} catch (LazyInitializationException lie) {
			System.out.println("since we closed the session BEFORE getting the contacts, it throws an exception");
		} finally {
			session.close();
		}

		
		

	}
	
	public static Address getHomeAddress() {
		Address address = new Address();
		address.setStreet("1907 Blah drive");
		address.setCity("Wylie");
		address.setState("TX");
		address.setZipCode("75098");
		
		return address;
	}
	
	public static Address getWorkAddress() {
		Address workAddress = new Address();
		workAddress.setStreet("1950 Stemmons Frwy");
		workAddress.setCity("Dallas");
		workAddress.setState("TX");
		workAddress.setZipCode("75074");
		
		return workAddress;
	}
	
	public static Contact getHomeContact() {
		Contact contact = new Contact();
		contact.setContactType("HOME");
		contact.setPhoneNumber("972-444-HOME");
		contact.setEmail("user1@home.com");
		return contact;
	}
	
	public static Contact getWorkContact() {
		Contact contact = new Contact();
		contact.setContactType("WORK");
		contact.setPhoneNumber("972-444-WORK");
		contact.setEmail("user1@work.com");
		return contact;
	}

}
