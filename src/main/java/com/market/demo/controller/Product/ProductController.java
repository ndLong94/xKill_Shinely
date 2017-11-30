package com.market.demo.controller.Product;

import java.util.List;

import com.market.demo.Form.ProductForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.controller.User.UserService;
import com.market.demo.domain.Product;

import javax.validation.Valid;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
    UserService userService;
	
	@Autowired
    ProductService productService;
	
	private static final Logger m_logger = Logger.getLogger(Product.class);
	

	@GetMapping("")
    @ResponseBody
	public ResponseEntity<Object> getAllProduct() {
        List<Product> products = productService.findAllProducts();
        return ControllerUtils.createSuccessResponseEntity(products, HttpStatus.OK);
	}
	
	@PutMapping("")
	public String addProduct(@RequestBody @Valid ProductForm productForm) {
			productService.save(new Product(productForm));
		return "redirect:/product";
	}
	
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<Object> deleteArticle(@PathVariable("productId") Long productId) {
		if (null == productId)
			throw new IllegalArgumentException("Product Id is not exist");
			productService.delete(productId);
			return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}
}
