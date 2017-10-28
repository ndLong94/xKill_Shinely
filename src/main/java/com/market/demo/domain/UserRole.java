package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "userrole")
@Getter
@Setter
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userroleid", nullable = false)
    private Long userRoleId;

    @Column(name = "userid")
    private String userId;

    @Column(name = "roleid")
    private String roleId;

}
