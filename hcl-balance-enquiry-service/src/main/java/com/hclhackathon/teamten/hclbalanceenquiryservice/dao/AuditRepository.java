package com.hclhackathon.teamten.hclbalanceenquiryservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.hclhackathon.teamten.hclbalanceenquiryservice.entity.Transaction_Audit;

public interface AuditRepository extends CrudRepository<Transaction_Audit, Integer> {

}
