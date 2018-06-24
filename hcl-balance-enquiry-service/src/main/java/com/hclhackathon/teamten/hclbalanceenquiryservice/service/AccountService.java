package com.hclhackathon.teamten.hclbalanceenquiryservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hclhackathon.teamten.hclbalanceenquiryservice.dao.AccountRepository;
import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Account;
import com.hclhackathon.teamten.hclbalanceenquiryservice.exception.AccountNotFoundException;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	
	public List<Account> getAllAccounts(){
		List<Account> Accounts = new ArrayList<Account>();
		accountRepository.findAll()
						.forEach(Accounts:: add);
		return Accounts;
	}

	public Account getAccount(int AccountId){
		return accountRepository.findById(AccountId).get();
	}
	
	
	public List<Account> getCustAccountBalance(int custId){
		List<Account> account = null;
		
		try{
			account = accountRepository.findByCustId(custId).get();		
		}catch (NoSuchElementException elementException){
			throw new AccountNotFoundException("AccountService.ACCOUNT_NOT_FOUND");
		}
		
			return account;
	}
	
	public void addAccount(Account account){		
			accountRepository.save(account);
	}
	
	public void updateAccount(Account account) throws Exception{
		validate(account);
		
		accountRepository.save(account);
	}
	
	private void validate(Account account) throws Exception {
		
		if(!isValid(account.getAccnum())){
			System.out.println("Account Number is NOT valid");
			throw new Exception("");
		}
		
	}

	private boolean isValid(int accnum) {
		
		// Here account number must of length 10 and should contain only digits
		String regEx = "[0-9]{10}";

		// For Checking email address
		//String regEx = "^[a-zA-Z0-9+.-]+@(.+)$";
		
		// For checking string with can contain digits and must be withing 4 to 10 length
//		String regEx = "^[a-zA-Z0-9]{4,10}+$";
//		
		
		Pattern pattern = Pattern.compile(regEx);
		
		Matcher matcher = pattern.matcher(Integer.toString(accnum));
		
		if(matcher.matches()){
			return true;
		}else
			return false;
		
		
		
		return false;
	}

	public void deleteAccount(int AccountId){
		accountRepository.deleteById(AccountId);
	}
}
