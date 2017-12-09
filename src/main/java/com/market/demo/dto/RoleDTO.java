package com.market.demo.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDTO {
	
	@NotNull(message = "Role Name cannot be null")
	private String roleName;
}
