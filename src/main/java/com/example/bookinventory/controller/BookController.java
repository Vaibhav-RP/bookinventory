package com.example.bookinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookinventory.entity.Book;
import com.example.bookinventory.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books-by-author/{authorName}")
    public List<Book> getBooksByAuthor(@PathVariable String authorName) {
        return bookService.getBooksByAuthor(authorName);
    }
}

