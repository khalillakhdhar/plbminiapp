package com.demonstration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.model.Author;
import com.demonstration.repo.AuthorRepository;


@Service
public class AuthorServiceImplement implements AuthorService {
@Autowired
AuthorRepository authorRepository;
	@Override
	public Author createOne(Author author) {
		// TODO Auto-generated method stub
		return authorRepository.save(author);
	}

	@Override
	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}

	@Override
	public Author getOne(long id) {
		// TODO Auto-generated method stub
		return authorRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOne(long id) {
		// TODO Auto-generated method stub
		authorRepository.deleteById(id);
	}

}
