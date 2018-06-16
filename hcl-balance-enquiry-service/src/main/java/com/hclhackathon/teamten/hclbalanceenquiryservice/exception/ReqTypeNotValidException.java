package com.hclhackathon.teamten.hclbalanceenquiryservice.exception;

public class ReqTypeNotValidException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ReqTypeNotValidException(){
		super();
	}

	public ReqTypeNotValidException(final String message){
		super(message);
	}

}
