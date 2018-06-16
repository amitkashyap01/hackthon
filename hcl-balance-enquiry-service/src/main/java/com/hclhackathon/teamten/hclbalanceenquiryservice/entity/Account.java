package com.hclhackathon.teamten.hclbalanceenquiryservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Author: Amit Kashyap
 */


@Entity
@Table (name = "Account")
public class Account {
	@Id
	private int id;
	private int accnum;
	private String actccy;
	private String acttype;
	private int balance;
	private int custId;
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
	public String getActccy() {
		return actccy;
	}
	public void setActccy(String actccy) {
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
	
	

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", accnum=" + accnum + ", actccy=" + actccy + ", acttype=" + acttype
				+ ", balance=" + balance + ", cust_id=" + custId + "]";
	}
	
}
