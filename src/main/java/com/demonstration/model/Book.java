package com.demonstration.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Book extends Audit implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String title;
private int publicationYear;
@ManyToOne(optional = true)
@JoinColumn(name = "author_id", nullable = false)
@JsonIgnore

private Author author;
@Temporal(TemporalType.TIMESTAMP)
//@JsonFormat(JJ/MM/AAAA)
//private Date publish;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPublicationYear() {
	return publicationYear;
}
public void setPublicationYear(int publicationYear) {
	this.publicationYear = publicationYear;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [title=" + title + ", publicationYear=" + publicationYear + ", author=" + author.toString() + "]";
}




}
