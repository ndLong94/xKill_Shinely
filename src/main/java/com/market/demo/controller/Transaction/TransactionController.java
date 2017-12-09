package com.market.demo.controller.Transaction;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.domain.Transaction;
import com.market.demo.dto.TransactionDTO;

@Controller
@RequestMapping("transaction")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;

	private static final Logger m_logger = Logger.getLogger(Transaction.class);

	@GetMapping("")
	@ResponseBody
	public ResponseEntity<Object> getAllTransaction() {
		List<Transaction> transactions = transactionService.findAllTransactions();
		return ControllerUtils.createSuccessResponseEntity(transactions, HttpStatus.OK);
	}

	@PostMapping("/{transactionId}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("transactionId") Long transactionId) {
		if (null == transactionId)
			throw new IllegalArgumentException("Transaction Id is not exist");
		Transaction transaction = transactionService.findById(transactionId);
		return ControllerUtils.createSuccessResponseEntity(transaction, HttpStatus.OK);
	}

	@PutMapping("/add")
	public String addTransaction(@RequestBody @Valid TransactionDTO transaction) {
		transactionService.save(new Transaction(transaction));
		return "redirect:/transaction";
	}

	@PutMapping("/update")
	public String updateTransaction(@RequestBody @Valid TransactionDTO transaction) {
		transactionService.save(new Transaction(transaction));
		return "redirect:/transaction";
	}

	@DeleteMapping("/delete/{transactionId}")
	public ResponseEntity<Object> deleteTransaction(@PathVariable("transactionId") Long transactionId) {
		if (null == transactionId)
			throw new IllegalArgumentException("Transaction Id is not exist");
		transactionService.delete(transactionId);
		return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}
}
