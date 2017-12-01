package com.market.demo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.ProvinceForm;

@Entity
@Table(name = "province")
@Getter
@Setter
public class Province {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provinceid", nullable = false)
    private Long provinceId;

    @Column(name = "provincename")
    private String provinceName;
    
    public Province(ProvinceForm provinceForm) {
		this.provinceName = provinceForm.getProvinceName();
	}

	public Province() {
		super();
	}
}
