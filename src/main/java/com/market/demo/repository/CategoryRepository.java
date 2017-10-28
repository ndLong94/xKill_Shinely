package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
