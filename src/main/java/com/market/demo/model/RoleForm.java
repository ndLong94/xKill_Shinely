package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleForm {
	
	@NotNull(message = "Role Name cannot be null")
	private String roleName;
}
