package com.testing.restexample.accountdetail.services;

import java.util.ArrayList;
import java.util.List;

import com.testing.restexample.accountdetail.dao.DatabaseManager;
import com.testing.restexample.accountdetail.model.AccountDetailTO;

public class AccountDetailService {
	
	DatabaseManager dbManager;
	
	public AccountDetailService() {
		dbManager = new DatabaseManager();
	}
	
	public List<AccountDetailTO> getAllAccountDetails() {
		
		System.out.println("getAllAccountDetails");
		
		List<AccountDetailTO> accountDetails = new ArrayList<>();
		
		// temporary
		accountDetails = getTempAccountDetail();
		
		return accountDetails;
	}
	
	private List<AccountDetailTO> getTempAccountDetail() {
		System.out.println("getTempAccountDetail");
		List<AccountDetailTO> accountDetails = new ArrayList<>();
		
		AccountDetailTO accountDetail1 = new AccountDetailTO("FirstCustomer", "FirstAccount", 100001, 111.11);
		AccountDetailTO accountDetail2 = new AccountDetailTO("SecondCustomer", "SecondAccount", 100002, 222.22);
		
		accountDetails.add(accountDetail1);
		accountDetails.add(accountDetail2);
		
		return accountDetails;
	}

}
