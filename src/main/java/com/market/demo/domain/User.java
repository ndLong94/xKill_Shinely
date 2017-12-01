package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.UserForm;

import java.io.Serializable;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid", nullable = false)
	private Long userId;

	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "midname")
	private String midName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "password", nullable = false, length = 50)
	private String password;

	@Column(name = "username", nullable = false)
	private String userName;

	@Column(name = "phonenumber")
    private String phoneNumber;

	@Column(name = "coin")
    private String coin;

	@Column(name = "email")
	private String email;
	
	public User(UserForm userForm) {
		super();
		this.firstName = userForm.getFirstName();
		this.midName = userForm.getMidName();
		this.lastName = userForm.getLastName();
		this.password = userForm.getPassword();
		this.userName = userForm.getUserName();
		this.phoneNumber = userForm.getPhoneNumber();
		this.coin = userForm.getCoin();
		this.email = userForm.getEmail();
	}
	
	public User() {
		super();
	}

}
