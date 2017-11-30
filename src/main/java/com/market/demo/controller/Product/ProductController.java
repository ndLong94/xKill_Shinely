package com.market.demo.controller.Product;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.controller.User.UserService;
import com.market.demo.domain.Product;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
    UserService userService;
	
	@Autowired
    ProductService productService;
	
	private static final Logger m_logger = Logger.getLogger(Product.class);
	
	@GetMapping("")
	public String index(Model model) {
		return "testaddproduct";
	}
	
	@PostMapping("")
    @ResponseBody
	public ResponseEntity<Object> getAllProduct() {
        List<Product> products = productService.findAllProducts();
        return ControllerUtils.createSuccessResponseEntity(products, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestParam(value = "ownerid") Long ownerId, @RequestParam(value = "categoryid") Long categoryId,
			@RequestParam(value = "title") String title, @RequestParam(value = "description") String description,
			@RequestParam(value = "quantity") String quantity, @RequestParam(value = "postdate") String postDate,
			@RequestParam(value = "expiredate") String expireDate,@RequestParam(value = "villageid") Long villageId ) {
		try {
			productService
					.save(new Product(ownerId, categoryId, title, description, quantity, postDate, expireDate, villageId));
		} catch (Exception e) {
			m_logger.error("Exception occured while adding product", e);
		}
		return "redirect:/product";
	}
	
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<Object> deleteArticle(@PathVariable("productId") Long productId) {
		if (productService.findById(productId) !=null) {
			productService.delete(productId);
			return ControllerUtils.deleteSuccessResponseEntity(productId, HttpStatus.OK);
		}
		return ControllerUtils.deleteSuccessResponseEntity(productId, HttpStatus.METHOD_NOT_ALLOWED);
	}
}
