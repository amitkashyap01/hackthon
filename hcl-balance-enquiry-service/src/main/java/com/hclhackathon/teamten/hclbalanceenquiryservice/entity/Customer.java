package com.hclhackathon.teamten.hclbalanceenquiryservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Customer")
public class Customer {
	@Id
	private int id;
	private int accnum;
	private int actccy;
	private String acttype;
	private int balance;
	private int cust_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public int getActccy() {
		return actccy;
	}
	public void setActccy(int actccy) {
		this.actccy = actccy;
	}
	public String getActtype() {
		return acttype;
	}
	public void setActtype(String acttype) {
		this.acttype = acttype;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", accnum=" + accnum + ", actccy=" + actccy + ", acttype=" + acttype
				+ ", balance=" + balance + ", cust_id=" + cust_id + "]";
	}
	
}
