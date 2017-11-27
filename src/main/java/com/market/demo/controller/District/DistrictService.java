package com.market.demo.controller.District;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.District;
import com.market.demo.repository.DistrictRepository;

@Service
public class DistrictService {
	@Autowired
	private DistrictRepository districtRepository;
	
	public District findById(Long districtId) {
		District district = districtRepository.findOne(districtId);
	    if (null == district)
            throw new EntityNotFoundException("districtId Not Found");
        return district;
    }
	
	public District findByName(String districtName) {
		District district = districtRepository.findByName(districtName);
	    if (null == district)
            throw new EntityNotFoundException("districtName Not Found");
        return district;
    }
	
	public District findByProvinceId(Long provinceId) {
		District district = districtRepository.findByProvinceId(provinceId);
	    if (null == district)
            throw new EntityNotFoundException("provinceId Not Found");
        return district;
    }
	
}
