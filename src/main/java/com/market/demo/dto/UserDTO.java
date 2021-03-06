package com.market.demo.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	@NotNull(message = "First Name cannot be null")
	private String firstName;
	
	private String midName;
	
	@NotNull(message = "Last Name cannot be null")
	private String lastName;

	@JsonIgnore
	@NotNull(message = "Password cannot be null")
	private String password;
	
	@NotNull(message = "User Name cannot be null")
	private String userName;
	
	@NotNull(message = "Phone Number cannot be null")
    private String phoneNumber;
	
	@NotNull(message = "Coin cannot be null")
    private String coin;
    
    @NotNull(message = "Email cannot be null")
	private String email;
}
