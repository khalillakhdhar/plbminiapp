package com.demonstration.services;

import java.util.List;

import com.demonstration.model.Book;



public interface BooksService {
	public Book createOne(Book book,long authorid);
	public List<Book> getAll();
	public Book getOne(long id);
	public void deleteOne(long id);

}
