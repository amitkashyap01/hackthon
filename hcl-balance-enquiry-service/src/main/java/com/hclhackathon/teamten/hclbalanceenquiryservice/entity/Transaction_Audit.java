package com.hclhackathon.teamten.hclbalanceenquiryservice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table (name = "Transaction_Audit")
public class Transaction_Audit {

	@Id
	private int id;
	private String imessage;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date messingtime;
	private String status;
	private int reason_code;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date messgouttime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImessage() {
		return imessage;
	}

	public void setImessage(String imessage) {
		this.imessage = imessage;
	}

	public Date getMessingtime() {
		return messingtime;
	}

	public void setMessingtime(Date messingtime) {
		this.messingtime = messingtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getReason_code() {
		return reason_code;
	}

	public void setReason_code(int reason_code) {
		this.reason_code = reason_code;
	}

	public Date getMessgouttime() {
		return messgouttime;
	}

	public void setMessgouttime(Date messgouttime) {
		this.messgouttime = messgouttime;
	}

	@Override
	public String toString() {
		return "Transaction_Audit [id=" + id + ", imessage=" + imessage + ", messingtime=" + messingtime + ", status="
				+ status + ", reason_code=" + reason_code + ", messgouttime=" + messgouttime + "]";
	}
	
}
