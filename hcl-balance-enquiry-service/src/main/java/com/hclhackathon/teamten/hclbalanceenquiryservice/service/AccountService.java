package com.hclhackathon.teamten.hclbalanceenquiryservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
	
	
	public Account getCustAccountBalance(int custId){
		Account account = null;
		
		try{
			account = accountRepository.findByCustId(custId).get();		
		}catch (NoSuchElementException elementException){
			throw new AccountNotFoundException("Account NOT found");
		}
		
			return account;
	}
	
	public void addAccount(Account Account){		
			accountRepository.save(Account);
	}
	
	public void updateAccount(Account Account){
		accountRepository.save(Account);
	}
	
	public void deleteAccount(int AccountId){
		accountRepository.deleteById(AccountId);
	}
}
