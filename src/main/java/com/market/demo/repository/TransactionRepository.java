package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
