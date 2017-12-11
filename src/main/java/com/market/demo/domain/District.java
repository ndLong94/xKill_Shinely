package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.dto.DistrictDTO;

@Entity(name = "district")
@Getter
@Setter
@NoArgsConstructor
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "districtid", nullable = false)
    private Long districtId;

    @Column(name = "provinceid")
    private Long provinceId;

    @Column(name = "districtname")
    private String districtName;
    
    public District(DistrictDTO district) {
		this.provinceId = district.getProvinceId();
		this.districtName = district.getDistrictName();
	}

}
