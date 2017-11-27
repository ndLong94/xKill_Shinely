package com.market.demo.controller.Province;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.Province;
import com.market.demo.repository.ProvinceRepository;

@Service
public class ProvinceService {
	
	@Autowired
	private ProvinceRepository provinceRepository;
	
	public Province findById(Long provinceId) {
		Province province = provinceRepository.findOne(provinceId);
	    if (null == province)
            throw new EntityNotFoundException("provinceId Not Found");
        return province;
    }
	
}
