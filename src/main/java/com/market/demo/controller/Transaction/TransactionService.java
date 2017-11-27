package com.market.demo.controller.Transaction;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.Transaction;
import com.market.demo.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction findById(Long transactionId) {
		Transaction transaction = transactionRepository.findOne(transactionId);
	    if (null == transaction)
            throw new EntityNotFoundException("transactionId Not Found");
        return transaction;
    }
	
	public Transaction findByUserId(Long userId) {
		Transaction transaction = transactionRepository.findByUserId(userId);
	    if (null == transaction)
            throw new EntityNotFoundException("userId Not Found");
        return transaction;
    }
	
	public Transaction findByExchangerateId(Long exchangerateId) {
		Transaction transaction = transactionRepository.findByExchangerateId(exchangerateId);
	    if (null == transaction)
            throw new EntityNotFoundException("exchangerateId Not Found");
        return transaction;
    }
}
