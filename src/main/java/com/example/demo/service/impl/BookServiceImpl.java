package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override public List<Book> getAll() { return repository.findAll(); }
    @Override public Optional<Book> getById(Long id) { return repository.findById(id); }
    @Override public Book save(Book book) { return repository.save(book); }
    @Override public void delete(Long id) { repository.deleteById(id); }
}