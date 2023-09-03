package com.example.bookinventory.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookinventory.entity.Author;
import com.example.bookinventory.entity.Book;
import com.example.bookinventory.repository.AuthorRepository;
import com.example.bookinventory.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> getBooksByAuthor(String authorName) {
        Author author = authorRepository.findByName(authorName);
        if (author != null) {
            return bookRepository.findByAuthor(author);
        } else {
            return Collections.emptyList();
        }
    }
}
