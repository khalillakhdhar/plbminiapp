package com.demonstration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.demonstration.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
