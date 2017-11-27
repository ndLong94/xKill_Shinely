package com.market.demo.controller.Product;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.Product;
import com.market.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product findById(Long productId) {
		Product product = productRepository.findOne(productId);
	    if (null == product)
            throw new EntityNotFoundException("productId Not Found");
        return product;
    }
	
	public Product findByOwnerId(Long ownerId) {
		Product product = productRepository.findByOwnerId(ownerId);
	    if (null == product)
            throw new EntityNotFoundException("ownerId Not Found");
        return product;
    }
	
	public Product findByProvinceId(Long provinceId) {
		
		Product product = productRepository.findByProvinceId(provinceId);
	    if (null == product)
            throw new EntityNotFoundException("provinceId Not Found");
        return product;
    }
	
	public Product findByVillageId(Long villageId) {
		Product product = productRepository.findByVillageId(villageId);
	    if (null == product)
            throw new EntityNotFoundException("villageId Not Found");
        return product;
    }
	
	public Product findByCategoryId(Long categoryId) {
		Product product = productRepository.findByCategoryId(categoryId);
	    if (null == product)
            throw new EntityNotFoundException("categoryId Not Found");
        return product;
    }
	
}
