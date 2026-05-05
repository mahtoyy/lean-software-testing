package com.example.demo.service;

import com.example.demo.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAll();
    Optional<Book> getById(Long id);
    Book save(Book book);
    void delete(Long id);
}