package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    private Long privinceId;

    @Column(name = "districtname")
    private String districtName;

}
