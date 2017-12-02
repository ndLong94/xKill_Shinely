package com.market.demo.controller.District;

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
import com.market.demo.domain.District;
import com.market.demo.model.DistrictDTO;

@Controller
@RequestMapping("district")
public class DistrictController {

	@Autowired
	DistrictService districtService;

	private static final Logger m_logger = Logger.getLogger(District.class);

	@GetMapping("")
	@ResponseBody
	public ResponseEntity<Object> getAllCategory() {
		List<District> districts = districtService.findAllCategorys();
		return ControllerUtils.createSuccessResponseEntity(districts, HttpStatus.OK);
	}

	@PostMapping("/{districtId}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("districtId") Long districtId) {
		if (null == districtId)
			throw new IllegalArgumentException("District Id is not exist");
		District district = districtService.findById(districtId);
		return ControllerUtils.createSuccessResponseEntity(district, HttpStatus.OK);
	}

	@PutMapping("/add")
	public String addDistrict(@RequestBody @Valid DistrictDTO district) {
		districtService.save(new District(district));
		return "redirect:/district";
	}

	@PutMapping("/update")
	public String updateDistrict(@RequestBody @Valid DistrictDTO district) {
		districtService.save(new District(district));
		return "redirect:/district";
	}

	@DeleteMapping("/delete/{districtId}")
	public ResponseEntity<Object> deleteDistrict(@PathVariable("districtId") Long districtId) {
		if (null == districtId)
			throw new IllegalArgumentException("District Id is not exist");
		districtService.delete(districtId);
		return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}
}
