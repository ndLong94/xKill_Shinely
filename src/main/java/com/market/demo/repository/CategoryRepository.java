package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	@Query(value = "select * from category where categoryName=?1" , nativeQuery = true)
	Category findByName(String categoryName);
}
