package com.market.demo.repository;

import com.market.demo.domain.District;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends CrudRepository<District, Long> {
	@Query(value = "select * from district where districtname=?1" , nativeQuery = true)
	District findByName(String districtName);
	
	@Query(value = "select * from district where provinceId=?1" , nativeQuery = true)
	District findByProvinceId(Long provinceId);
	
	
	
}
