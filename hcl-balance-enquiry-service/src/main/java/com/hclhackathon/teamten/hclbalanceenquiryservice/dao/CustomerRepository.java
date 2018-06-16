package com.hclhackathon.teamten.hclbalanceenquiryservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
