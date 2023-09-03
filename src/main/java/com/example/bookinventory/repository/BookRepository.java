package com.example.bookinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookinventory.entity.Author;
import com.example.bookinventory.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(Author author);
}
