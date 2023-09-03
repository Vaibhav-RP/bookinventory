package com.example.bookinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookinventory.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByName(String name);
}
