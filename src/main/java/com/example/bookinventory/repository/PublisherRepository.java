package com.example.bookinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookinventory.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}