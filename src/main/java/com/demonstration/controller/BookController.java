package com.demonstration.controller;
import com.demonstration.model.Book;
import com.demonstration.services.BookServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookServiceImplement bookService;

    @PostMapping("/{authorid}")
    public Book createBook(@RequestBody Book book,@PathVariable long authorid) {
        return bookService.createOne(book,authorid);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id) {
        return bookService.getOne(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }

    @DeleteMapping("/{id}")
    public Void deleteBook(@PathVariable long id) {
        bookService.deleteOne(id);
        return null;
    }
}
