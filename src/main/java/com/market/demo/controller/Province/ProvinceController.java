package com.market.demo.controller.Province;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
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
import com.market.demo.domain.Province;
import com.market.demo.model.ProvinceDTO;

@Controller
@RequestMapping("province")
public class ProvinceController {
	
	@Autowired
	ProvinceService provinceService;

	private static final Logger m_logger = Logger.getLogger(Province.class);

	@GetMapping("")
	@ResponseBody
	public ResponseEntity<Object> getAllProvince() {
		List<Province> provinces = provinceService.findAllProvinces();
		return ControllerUtils.createSuccessResponseEntity(provinces, HttpStatus.OK);
	}

	@PostMapping("/{provinceId}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("provinceId") Long provinceId) {
		if (null == provinceId)
			throw new IllegalArgumentException("Province Id is not exist");
		Province province = provinceService.findById(provinceId);
		return ControllerUtils.createSuccessResponseEntity(province, HttpStatus.OK);
	}

	@PutMapping("/add")
	public String addProvince(@RequestBody @Valid ProvinceDTO province) {
		provinceService.save(new Province(province));
		return "redirect:/province";
	}

	@PutMapping("/update")
	public String updateProvince(@RequestBody @Valid ProvinceDTO province) {
		provinceService.save(new Province(province));
		return "redirect:/province";
	}

	@DeleteMapping("/delete/{provinceId}")
	public ResponseEntity<Object> deleteProvince(@PathVariable("provinceId") Long provinceId) {
		if (null == provinceId)
			throw new IllegalArgumentException("Province Id is not exist");
		provinceService.delete(provinceId);
		return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}
}
