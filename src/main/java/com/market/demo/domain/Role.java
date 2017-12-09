package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleid", nullable = false)
    private Long roleId;

    @Column(name = "rolename")
    private String roleName;

    public String getRoleStr(){
        if (1 == roleId)
            return "admin";
        if (2 == roleId)
            return "user";
        return "undefined";
    }
}
