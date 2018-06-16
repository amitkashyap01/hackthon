package com.hclhackathon.teamten.hclbalanceenquiryservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany
	@JoinColumn(name = "cust_id", referencedColumnName="cust_id")
	private List<Account> accounts = new ArrayList<Account>();	
	
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
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
