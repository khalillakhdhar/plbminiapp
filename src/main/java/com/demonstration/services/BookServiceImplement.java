package com.demonstration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.model.Author;
import com.demonstration.model.Book;
import com.demonstration.repo.BookRepository;


@Service
public class BookServiceImplement implements BooksService {
@Autowired
BookRepository bookRepository;
@Autowired
AuthorService authorService;
	@Override
	public Book createOne(Book book,long authorid) {
		// TODO Auto-generated method stub
		Author author=authorService.getOne(authorid);
		book.setAuthor(author);
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getOne(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOne(long id) {
		// TODO Auto-generated method stub
bookRepository.deleteById(id);
	}

}
