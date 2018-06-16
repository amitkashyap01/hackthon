package com.hclhackathon.teamten.hclbalanceenquiryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Customer;
import com.hclhackathon.teamten.hclbalanceenquiryservice.service.CustomerService;

@RestController
@RequestMapping (value = "/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void addCusomter(@RequestBody Customer customer){
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
}
