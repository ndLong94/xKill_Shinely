package com.market.demo.repository;

import com.market.demo.domain.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	@Query(value = "select * from product where ownerId=?1" , nativeQuery = true)
	List<Product> findByOwnerId(Long ownerId);
	
	@Query(value = "select * from product where provinceId=?1" , nativeQuery = true)
	List<Product> findByProvinceId(Long provinceId);
	
	@Query(value = "select * from product where villageId=?1" , nativeQuery = true)
	List<Product> findByVillageId(Long villageId);
	
	@Query(value = "select * from product where categoryId=?1" , nativeQuery = true)
	List<Product> findByCategoryId(Long categoryId);
}
