package com.javabrains.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="PETS") 
public class Pet {
	@Id
	@GeneratedValue
	private int petId;
	private String petName;
	private String petType;
	@ManyToOne 
	@JoinColumn(name="OWNER_ID")
	private UserDetails owner;
	
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public UserDetails getOwner() {
		return owner;
	}
	public void setOwner(UserDetails owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", petType=" + petType + "]";
	}
}
