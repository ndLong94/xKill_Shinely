package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.District;
import org.springframework.data.repository.CrudRepository;

public interface DistrictRepository extends CrudRepository<District, Long> {
}
