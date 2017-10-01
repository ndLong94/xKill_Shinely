package com.market.demo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
