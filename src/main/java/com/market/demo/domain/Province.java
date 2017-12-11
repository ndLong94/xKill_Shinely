package com.market.demo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.dto.ProvinceDTO;

@Entity(name = "province")
@Getter
@Setter
@NoArgsConstructor
public class Province {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provinceid", nullable = false)
    private Long provinceId;

    @Column(name = "provincename")
    private String provinceName;

    @Column(name = "code")
    private long code;
    
    public Province(ProvinceDTO provinceDTO) {
		this.provinceName = provinceDTO.getProvinceName();
	}

}
