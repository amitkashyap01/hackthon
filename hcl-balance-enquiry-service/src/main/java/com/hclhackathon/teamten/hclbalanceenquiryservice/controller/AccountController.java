package com.hclhackathon.teamten.hclbalanceenquiryservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Account;
import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Customer;
import com.hclhackathon.teamten.hclbalanceenquiryservice.exception.CustomerNotFoundException;
import com.hclhackathon.teamten.hclbalanceenquiryservice.service.AccountService;
import com.hclhackathon.teamten.hclbalanceenquiryservice.service.CustomerService;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CustomerService customerService; 
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void addAccount(@RequestBody Account account){
		Optional<Customer> customer = customerService.getCustomer(account.getCustId());
		
		if(!customer.isPresent())
			throw new CustomerNotFoundException("Customer with custId "+account.getCustId()+" NOT FOUND");
		
		accountService.addAccount(account);
	}

	
}
