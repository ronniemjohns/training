package com.testing.restexample.accountdetail.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="account_detail")
public class AccountDetail { 

	@Id
	@Column(name="account_number")
	private int accountNumber;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="account_name")
	private String accountName;
	@Column(name="balance")
	private BigDecimal balance;

	
	public AccountDetail() {
		
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
	
	
} 