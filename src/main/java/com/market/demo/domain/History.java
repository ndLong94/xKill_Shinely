package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "history")
@Getter
@Setter
@NoArgsConstructor
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "historyid", nullable = false)
    private Long historyId;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "deductcoin")
    private String deductCoin;

    @Column(name = "note")
    private String note;
}
