package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transactionid", nullable = false)
    private Long transactionId;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "exchangerateid")
    private Long exchangerateId;

    @Column(name = "dayofcharge")
    private String dayOfCharge;
}
