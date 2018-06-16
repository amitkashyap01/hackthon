package com.hclhackathon.teamten.hclbalanceenquiryservice.exception;


/*
 * Author: Amit Kashyap
 */

public class AccountNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AccountNotFoundException(){
		super();
	}

	public AccountNotFoundException(final String message){
		super(message);
	}
	
	
}
