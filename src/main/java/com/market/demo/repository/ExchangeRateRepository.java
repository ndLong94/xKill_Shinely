package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.ExchangeRate;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeRateRepository extends CrudRepository<ExchangeRate, Long> {
}
