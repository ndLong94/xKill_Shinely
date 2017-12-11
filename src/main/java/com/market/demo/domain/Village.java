package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity(name = "village")
@Getter
@Setter
@NoArgsConstructor
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "villageid", nullable = false)
    private Long villageId;

    @Column(name = "districtid")
    private Long districtId;

    @Column(name = "villagename")
    private String villageName;
}
