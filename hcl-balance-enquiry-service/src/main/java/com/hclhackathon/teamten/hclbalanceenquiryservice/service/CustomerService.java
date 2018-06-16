package com.hclhackathon.teamten.hclbalanceenquiryservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hclhackathon.teamten.hclbalanceenquiryservice.dao.CustomerRepository;
import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		List<Customer> Customers = new ArrayList<Customer>();
		customerRepository.findAll()
						.forEach(Customers:: add);
		return Customers;
	}

	public Optional<Customer> getCustomer(int CustomerId){
		return customerRepository.findById(CustomerId);
	}
	
	
	public void addCustomer(Customer Customer){		
			customerRepository.save(Customer);
	}
	
	public void updateCustomer(Customer Customer){
		customerRepository.save(Customer);
	}
	
	public void deleteCustomer(int CustomerId){
		customerRepository.deleteById(CustomerId);
	}
	
}
