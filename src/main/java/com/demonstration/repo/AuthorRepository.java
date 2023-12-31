package com.demonstration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.demonstration.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
