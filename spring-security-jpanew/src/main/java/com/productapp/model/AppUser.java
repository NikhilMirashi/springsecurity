package com.productapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppUser {

	@Column(unique = true, length = 20)
	private String username;

	//@Column(unique = true, length = 20)
	private String password;

	@Id
	@GeneratedValue
	private Integer Id;

	public AppUser() {
		super();
	}

	

	public AppUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	@Override
	public String toString() {
		return "AppUser [username=" + username + ", password=" + password + ", Id=" + Id + "]";
	}

}
