package com.market.demo.domain;

import com.market.demo.dto.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Product> products = new HashSet<Product>(0);
	
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
	
	public User(UserDTO user) {
		super();
		this.firstName = user.getFirstName();
		this.midName = user.getMidName();
		this.lastName = user.getLastName();
		this.password = user.getPassword();
		this.userName = user.getUserName();
		this.phoneNumber = user.getPhoneNumber();
		this.coin = user.getCoin();
		this.email = user.getEmail();
	}
	
	public User(UserDTO user, Set<Product> products) {
		super();
		this.firstName = user.getFirstName();
		this.midName = user.getMidName();
		this.lastName = user.getLastName();
		this.password = user.getPassword();
		this.userName = user.getUserName();
		this.phoneNumber = user.getPhoneNumber();
		this.coin = user.getCoin();
		this.email = user.getEmail();
		this.products = products;
	}
	

}
