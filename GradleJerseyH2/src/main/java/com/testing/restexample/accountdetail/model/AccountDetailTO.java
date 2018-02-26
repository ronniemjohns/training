package com.testing.restexample.accountdetail.model;

public class AccountDetailTO {
	
	private String customerName;
	private String accountName;
	private double balance;
	private int accountNumber;
	
	public AccountDetailTO() {
		
	}

	public AccountDetailTO(String customerName, String accountName, int accountNumber, double balance) {
		super();
		this.customerName = customerName;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append("Customer Name: " );
		output.append(getCustomerName());
		output.append("\n");
		
		output.append("Account Name: " );
		output.append(getAccountName());
		output.append("\n");
		
		output.append("Account Number: " );
		output.append(getAccountNumber());
		output.append("\n");
		
		output.append("Balance: " );
		output.append(getBalance());
		output.append("\n");
		
		return output.toString();
		
	}

}
