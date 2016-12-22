package com.javabrains.hibernate.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //(name="USER_DETAILS")   // not necessary, but a good way to specific if not defaulting it to classname
@Table (name="USER_DETAILS")      // keeps entity UserDetails but maps to a specific table
public class UserDetails {
	
	/*  embeddable OBJECT that is used as the primary key
	@EmbeddedId
	private UserLogin userLogin
	*/
	
	@Id
	//@Column (name="USER_ID")  // @Column allows you to map a column to a property that doesn't match name wise
	@GeneratedValue (strategy=GenerationType.AUTO)   // ask Hibernate to auto-generate this 
	private int userId;
	//@Column (name= "USER_NAME", nullable=false)
	//@Basic (optional=false)
	//@Transient   // makes it skip this field from a DB standpoint (column won't exist)
	private String userName;
	@Temporal (TemporalType.DATE)  // allows you to specify whether it's a date, timestamp without tz (default), etc... 
	private Date joinedDate;
	@Lob // hibernate will determine whether BLOB or CLOB based on the java type (CLOB in this case)
	private String description;
	@Embedded // optional to point this out since Address is already @Embeddable
	private Address address;
	@ElementCollection
	private Set<Contact> contacts;
	
	@Embedded
	// below list of overrides helps create a new group of embeddable columns but with different names (when there may be two)
	@AttributeOverrides({
		@AttributeOverride (name="street", column=@Column(name="work_street")),
		@AttributeOverride (name="city",   column=@Column(name="work_city")),
		@AttributeOverride (name="state",  column=@Column(name="work_state")),
		@AttributeOverride (name="zipCode",column=@Column(name="work_zip"))	
	})
	private Address workAddress;
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	public void addContact(Contact contact) {
		if(this.contacts == null) {
			contacts = new HashSet<>();
		}
		contacts.add(contact);
	}
	
}
