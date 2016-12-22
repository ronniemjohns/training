package com.javabrains.hibernate.entity;

import java.util.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //(name="USER_DETAILS")   // not necessary, but a good way to specific if not defaulting it to classname
@Table (name="USER_DETAILS")      // keeps entity UserDetails but maps to a specific table
public class UserDetails {
	
	@Id
	//@Column (name="USER_ID")  // @Column allows you to map a column to a property that doesn't match name wise
	private int userId;
	//@Column (name= "USER_NAME", nullable=false)
	//@Basic (optional=false)
	//@Transient   // makes it skip this field from a DB standpoint (column won't exist)
	private String userName;
	//@Temporal (TemporalType.DATE)  // allows you to specify whether it's a date, timestamp without tz (default), etc... 
	private Date joinedDate;
	private String address;
	//@Lob // hibernate will determine whether BLOB or CLOB based on the java type (CLOB in this case)
	private String description;
	
	public UserDetails() {
		
	}
	
	public UserDetails(int userId, String userName, Date joinedDate, String address, String description) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.joinedDate = joinedDate;
		this.address = address;
		this.description = description;
	}

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
