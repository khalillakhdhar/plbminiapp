package com.demonstration.services;

import java.util.List;

import com.demonstration.model.Author;



public interface AuthorService {
	public Author createOne(Author author);
	public List<Author> getAll();
	public Author getOne(long id);
	public void deleteOne(long id);
}
