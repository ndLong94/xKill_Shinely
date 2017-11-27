package com.market.demo.repository;

import com.market.demo.domain.Transaction;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
	
	@Query(value = "select * from transaction where userId=?1" , nativeQuery = true)
	Transaction findByUserId(Long userId);
	
	@Query(value = "select * from transaction where exchangerateId=?1" , nativeQuery = true)
	Transaction findByExchangerateId(Long exchangerateId);
}
