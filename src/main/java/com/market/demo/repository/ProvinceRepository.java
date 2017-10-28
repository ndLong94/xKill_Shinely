package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.Province;
import org.springframework.data.repository.CrudRepository;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
