package com.hclhackathon.teamten.hclbalanceenquiryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Transaction_Audit;
import com.hclhackathon.teamten.hclbalanceenquiryservice.service.AuditService;

@RestController
@RequestMapping (value = "/auditlogs")
public class AuditLogController {

	@Autowired
	private AuditService auditService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Transaction_Audit> getAllAudits(){
		return auditService.getAllTransaction_Audits();
	}

	@RequestMapping(method=RequestMethod.POST)
	public void addAudit(@RequestBody Transaction_Audit transaction_Audit){
		auditService.addTransaction_Audit(transaction_Audit);
	}

}
