package com.hclhackathon.teamten.hclbalanceenquiryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Account;
import com.hclhackathon.teamten.hclbalanceenquiryservice.exception.ReqTypeNotValidException;
import com.hclhackathon.teamten.hclbalanceenquiryservice.service.AccountService;
import com.hclhackathon.teamten.hclbalanceenquiryservice.service.AuditService;

@RestController
@RequestMapping (value="/api/balanceEnq")
public class BalanceEnquiryController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AuditService auditService;

	@RequestMapping(value="/customers/{cust_id}", method = RequestMethod.GET)
	public List<Account> checkTheBalance(@PathVariable("cust_id") int cust_id, @RequestHeader HttpHeaders headers){

		String requestType = headers.get("ReqType").get(0);

		if(!requestType.equals("Ballnq")){
			auditService.updateTheAuditLog("Invalid Request", "Fail");
			
			throw new ReqTypeNotValidException("Request Type "+ requestType +" is NOT valid");
		}else{
			
			System.out.println("Logging:  Customer Id: "+cust_id + " Request Type: "+headers.get("ReqType"));
			auditService.updateTheAuditLog("Balance Enquiry processed successfully for customer id"+cust_id, "Success");
			
			return accountService.getCustAccountBalance(cust_id);
		}

	}

}
