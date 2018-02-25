package com.testing.restexample.accountdetail.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.testing.restexample.accountdetail.model.AccountDetail;
import com.testing.restexample.accountdetail.services.AccountDetailService;

@Path("/account-details")
public class AccountDetailResource {
	
	AccountDetailService accountDetailService = new AccountDetailService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<AccountDetail> getAccountDetails() {

		System.out.println("Resource -> getAccountDetails");
		return accountDetailService.getAllAccountDetails();
	}
	
	

}
