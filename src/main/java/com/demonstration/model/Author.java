package com.demonstration.model;

import java.io.Serializable;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Author extends Audit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotBlank
	private String firstname,lastname;
	@OneToOne( cascade = CascadeType.ALL)
    @JsonIgnore
	private Profile profile;
	@OneToMany
    @JsonIgnore
	private HashSet<Book> books=new HashSet<Book>();
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [firstname=" + firstname + ", lastname=" + lastname + ", profile=" + profile + "]";
	}
	
}
