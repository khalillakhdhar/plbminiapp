package com.demonstration.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Profile extends Audit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
private String description;

@Min(value = 1900)
private int birthdate;

@OneToOne(optional = true)
@JsonProperty("author")
@JsonIgnore
private Author author;

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getBirthdate() {
	return birthdate;
}

public void setBirthdate(int birthdate) {
	this.birthdate = birthdate;
}

public Author getAuthor() {
	return author;
}

public void setAuthor(Author author) {
	this.author = author;
}

@Override
public String toString() {
	return "Profile [description=" + description + ", birthdate=" + birthdate + ", author=" + author.toString() + "]";
}





}
