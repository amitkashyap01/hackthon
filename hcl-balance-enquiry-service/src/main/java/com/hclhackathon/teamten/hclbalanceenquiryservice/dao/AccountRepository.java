package com.hclhackathon.teamten.hclbalanceenquiryservice.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{
	Optional<Account> findByCustId(int custId);
}
