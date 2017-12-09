package com.market.demo.controller.Category;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.domain.Category;
import com.market.demo.dto.CategoryDTO;

@Controller
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;


	@GetMapping("")
	@ResponseBody
	public ResponseEntity<Object> getAllCategory() {
		List<Category> categorys = categoryService.findAllCategorys();
		return ControllerUtils.createSuccessResponseEntity(categorys, HttpStatus.OK);
	}

	@PostMapping("/{categoryId}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("categoryId") Long categoryId) {
		if (null == categoryId)
			throw new IllegalArgumentException("Category Id is not exist");
		Category category = categoryService.findById(categoryId);
		return ControllerUtils.createSuccessResponseEntity(category, HttpStatus.OK);
	}

	@PutMapping("/add")
	public ResponseEntity<Object> addCategory(@RequestBody @Valid CategoryDTO category) {
		categoryService.saveOrUpdate(new Category(category));
		return ControllerUtils.createSuccessResponseEntity("Save successfully", HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateCategory(@RequestBody @Valid CategoryDTO category, @PathVariable("id") Long id) {
		categoryService.saveOrUpdate(new Category(category, id));
		return ControllerUtils.createSuccessResponseEntity("Update successfully", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{categoryId}")
	public ResponseEntity<Object> deleteCategory(@PathVariable("categoryId") Long categoryId) {
		if (null == categoryId)
			throw new IllegalArgumentException("Category Id is not exist");
		categoryService.delete(categoryId);
		return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}
}
