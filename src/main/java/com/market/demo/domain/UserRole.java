package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "userrole")
@Getter
@Setter
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userroleid", nullable = false)
    private Long userRoleId;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "roleid")
    private Long roleId;

    public String getRoleStr(){
        if (1 == roleId)
            return "admin";
        if (2 == roleId)
            return "user";
        return "undefined";
    }

}
