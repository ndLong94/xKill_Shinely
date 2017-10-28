package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
