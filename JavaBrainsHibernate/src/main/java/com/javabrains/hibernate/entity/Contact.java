package com.javabrains.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	
	private String contactType;
	private String phoneNumber;
	private String email;
	
	
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contact [contactType=" + contactType + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

	
	
	
}
