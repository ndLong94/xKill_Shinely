package com.market.demo.controller.Product;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.Product;
import com.market.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void save(Product product) {
        productRepository.save(product);
    }
	
	public void delete(Long productId) {
        productRepository.delete(productId);
    }
	
	public List<Product> findAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
	
	public Product findById(Long productId) {
		Product product = productRepository.findOne(productId);
	    if (null == product)
            throw new EntityNotFoundException("Product is Not Found");
        return product;
    }
	
	public List<Product> findByOwnerId(Long ownerId) {
		List<Product> products = productRepository.findByOwnerId(ownerId);
        return products;
    }
	
	public List<Product> findByProvinceId(Long provinceId) {

        List<Product> products = productRepository.findByProvinceId(provinceId);
        return products;
    }
	
	public List<Product> findByVillageId(Long villageId) {
        List<Product> products = productRepository.findByVillageId(villageId);
        return products;
    }
	
	public List<Product> findByCategoryId(Long categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId);
        return products;
    }
	
}
