package com.testing.restexample.accountdetail.services;

import java.util.ArrayList;
import java.util.List;

import com.testing.restexample.accountdetail.model.AccountDetail;

public class AccountDetailService {
	
	public List<AccountDetail> getAllAccountDetails() {
		
		System.out.println("getAllAccountDetails");
		
		List<AccountDetail> accountDetails = new ArrayList<>();
		
		// temporary
		accountDetails = getTempAccountDetail();
		
		return accountDetails;
	}
	
	private List<AccountDetail> getTempAccountDetail() {
		System.out.println("getTempAccountDetail");
		List<AccountDetail> accountDetails = new ArrayList<>();
		
		AccountDetail accountDetail1 = new AccountDetail("FirstCustomer", "FirstAccount", 100001, 111.11);
		AccountDetail accountDetail2 = new AccountDetail("SecondCustomer", "SecondAccount", 100002, 222.22);
		
		accountDetails.add(accountDetail1);
		accountDetails.add(accountDetail2);
		
		return accountDetails;
	}

}
