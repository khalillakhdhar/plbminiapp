package com.demonstration.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Admin extends Audit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotBlank
	@Column(unique = true)
	private String username;
	private String password;

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

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}
	

}
