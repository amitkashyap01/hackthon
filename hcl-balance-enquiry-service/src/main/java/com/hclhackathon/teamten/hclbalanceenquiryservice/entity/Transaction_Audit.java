package com.hclhackathon.teamten.hclbalanceenquiryservice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table (name = "Transaction_Audit")
public class Transaction_Audit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imessage;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date messintime;
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

	public Date getMessintime() {
		return messintime;
	}

	public void setMessintime(Date messingtime) {
		this.messintime = messingtime;
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
		return "Transaction_Audit [id=" + id + ", imessage=" + imessage + ", messintime=" + messintime + ", status="
				+ status + ", reason_code=" + reason_code + ", messgouttime=" + messgouttime + "]";
	}
	
}
