package com.market.demo.controller.Product;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.controller.User.UserService;
import com.market.demo.domain.Product;
import com.market.demo.model.ProductDTO;

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
	
	@PostMapping("/{productId}")
    @ResponseBody
    public ResponseEntity<Object> findById(@PathVariable("productId") Long productId) {
        if (null == productId)
            throw new IllegalArgumentException("Product Id is not exist");
        Product product = productService.findById(productId);
        return ControllerUtils.createSuccessResponseEntity(product, HttpStatus.OK);
    }
	
	@PutMapping("/add")
	public String addProduct(@RequestBody @Valid ProductDTO product) {
			productService.save(new Product(product));
		return "redirect:/product";
	}
	
	@PutMapping("/update")
	public String updateProduct(@RequestBody @Valid ProductDTO product) {
			productService.save(new Product(product));
		return "redirect:/product";
	}
	
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<Object> deleteProduct(@PathVariable("productId") Long productId) {
		if (null == productId)
			throw new IllegalArgumentException("Product Id is not exist");
			productService.delete(productId);
			return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}
}
