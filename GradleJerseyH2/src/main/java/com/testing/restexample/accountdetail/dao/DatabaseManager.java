package com.testing.restexample.accountdetail.dao;

import java.util.ArrayList;
import java.util.List;

import com.testing.restexample.accountdetail.model.AccountDetailTO;
import com.testing.restexample.database.DatabaseLoader;

public class DatabaseManager {
	
	DatabaseLoader dbLoader;
	
	public DatabaseManager () {
		if(dbLoader == null) {
			dbLoader = new DatabaseLoader();
			dbLoader.loadDatabase();
		}
	}
	
	public List<AccountDetailTO> getAllDetails() {
		List<AccountDetailTO> accountDetails = new ArrayList<>();
		
		
		return accountDetails;
	}

}
