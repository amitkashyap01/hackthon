package com.hclhackathon.teamten.hclbalanceenquiryservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Author: Amit Kashyap
 * Description: Account entity
 * */

@Entity
@Table (name="Customer")
public class Customer {

	@Id
	private int cust_id;
	private String cust_name;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	@Override
	public String toString() {
		return "Account [cust_id=" + cust_id + ", cust_name=" + cust_name + "]";
	}
	
}
