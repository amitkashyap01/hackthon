package com.hclhackathon.teamten.hclbalanceenquiryservice.exception;

public class CustomerNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6855372923714373479L;

	public CustomerNotFoundException(){
		super();
	}
	
	public CustomerNotFoundException(final String message){
		super(message);
	}

}
