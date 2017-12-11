package com.market.demo.repository;

import com.market.demo.domain.Address;
import com.market.demo.domain.Village;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
	
}
