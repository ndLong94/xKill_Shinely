package com.market.demo.controller.Category;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.Category;
import com.market.demo.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category findById(Long categoryId) {
		Category category = categoryRepository.findOne(categoryId);
	    if (null == category)
            throw new EntityNotFoundException("categoryId Not Found");
        return category;
    }
	
	public Category findByName(String categoryName) {
		Category category = categoryRepository.findByName(categoryName);
	    if (null == category)
            throw new EntityNotFoundException("categoryName Not Found");
        return category;
    }
}
