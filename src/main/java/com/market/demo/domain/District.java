package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.DistrictForm;

@Entity
@Table(name = "district")
@Getter
@Setter
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "districtid", nullable = false)
    private Long districtId;

    @Column(name = "provinceid")
    private Long provinceId;

    @Column(name = "districtname")
    private String districtName;
    
    public District(DistrictForm districtForm) {
		this.provinceId = districtForm.getProvinceId();
		this.districtName = districtForm.getDistrictName();
	}
    
	public District() {
		super();
	}

}
