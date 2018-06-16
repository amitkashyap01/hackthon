package com.hclhackathon.teamten.hclbalanceenquiryservice.controlleradvisor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.ExceptionFormat;
import com.hclhackathon.teamten.hclbalanceenquiryservice.exception.AccountNotFoundException;
import com.hclhackathon.teamten.hclbalanceenquiryservice.exception.ReqTypeNotValidException;

@ControllerAdvice
public class ControllerExceptionAdvisor {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionFormat handleGenericException(
			final Exception exception, final HttpServletRequest request){

		ExceptionFormat genericErrorMessage = new ExceptionFormat();

		genericErrorMessage.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		genericErrorMessage.setErrorMessage("Generic Exception: Sorry, we encountered some issues while "
				+ "handling your request");
		genericErrorMessage.setCallerURI(request.getRequestURI());

		return genericErrorMessage;	
	}

	@ExceptionHandler(AccountNotFoundException.class)
	@ResponseStatus(value = HttpStatus.CONFLICT)
	public @ResponseBody ExceptionFormat handleAccountNotFoundException( 
			final AccountNotFoundException exception, final HttpServletRequest request){
			
		ExceptionFormat ExceptionFormat = new ExceptionFormat();
		
		ExceptionFormat.setErrorMessage(exception.getMessage());
		ExceptionFormat.setErrorCode(HttpStatus.NOT_FOUND.value());
		ExceptionFormat.setCallerURI(request.getRequestURI());
		
		return ExceptionFormat;
	
	}	
	
	@ExceptionHandler(ReqTypeNotValidException.class)
	@ResponseStatus(value = HttpStatus.CONFLICT)
	public @ResponseBody ExceptionFormat handleReqTypeException( 
			final ReqTypeNotValidException exception, final HttpServletRequest request){
			
		ExceptionFormat ExceptionFormat = new ExceptionFormat();
		
		ExceptionFormat.setErrorMessage(exception.getMessage());
		ExceptionFormat.setErrorCode(HttpStatus.CONFLICT.value());
		ExceptionFormat.setCallerURI(request.getRequestURI());
		
		return ExceptionFormat;
	
	}	
	
}