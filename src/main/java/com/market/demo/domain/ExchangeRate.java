package com.market.demo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "exchangerate")
@Getter
@Setter
@NoArgsConstructor
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exchangerateid", nullable = false)
    private Long exchangerateId;

    @Column(name = "type")
    private String type;

    @Column(name = "rate")
    private String rate;
}
