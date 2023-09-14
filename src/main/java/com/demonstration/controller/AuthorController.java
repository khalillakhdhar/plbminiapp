package com.demonstration.controller;
import com.demonstration.model.Author;

import com.demonstration.services.AuthorServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    private AuthorServiceImplement authorService;

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createOne(author);
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable long id) {
        return authorService.getOne(id);
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAll();
    }

    @DeleteMapping("/{id}")
    public Void deleteAuthor(@PathVariable long id) {
        authorService.deleteOne(id);
        return null;
    }
}
