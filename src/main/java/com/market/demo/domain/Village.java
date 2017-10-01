package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "village")
@Getter
@Setter
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "villageid", nullable = false)
    private Long villageId;

    @Column(name = "districtid")
    private String districtId;

    @Column(name = "villagename")
    private String villageName;
}
