package com.hclhackathon.teamten.hclbalanceenquiryservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hclhackathon.teamten.hclbalanceenquiryservice.dao.AuditRepository;
import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Transaction_Audit;

@Service
public class AuditService {

	@Autowired
	private AuditRepository auditRepository;
	
	
	public List<Transaction_Audit> getAllTransaction_Audits(){
		List<Transaction_Audit> Transaction_Audits = new ArrayList<Transaction_Audit>();
		auditRepository.findAll()
						.forEach(Transaction_Audits:: add);
		return Transaction_Audits;
	}

	public Transaction_Audit getTransaction_Audit(int Transaction_AuditId){
		return auditRepository.findById(Transaction_AuditId).get();
	}
	
	
	public void addTransaction_Audit(Transaction_Audit Transaction_Audit){		
			auditRepository.save(Transaction_Audit);
	}
	
	public void updateTransaction_Audit(Transaction_Audit Transaction_Audit){
		auditRepository.save(Transaction_Audit);
	}
	
	public void deleteTransaction_Audit(int Transaction_AuditId){
		auditRepository.deleteById(Transaction_AuditId);
	}
	
	public void updateTheAuditLog(String message, String status){
		Transaction_Audit audit = new Transaction_Audit();
		
		audit.setImessage(message);
		audit.setStatus(status);
		
		auditRepository.save(audit);
		
	}
	
	public void updateAuditLogsRequestIn(String message){
		Transaction_Audit audit = new Transaction_Audit();
		
		audit.setImessage(message);
		audit.setMessintime(new Date());
		audit.setStatus("RECEIVED");
		
		auditRepository.save(audit);
	}
	
	public void updateAuditLogsResponseOut(String message){
		Transaction_Audit audit = new Transaction_Audit();
		
		audit.setImessage(message);
		audit.setMessgouttime(new Date());
		audit.setStatus("SENT");
		
		auditRepository.save(audit);
	}
}
