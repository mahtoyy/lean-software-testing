package com.example.demo.config;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository repository;

    @Value("${app.environment}")
    private String environment;

    public DataInitializer(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if ("test".equalsIgnoreCase(environment)) {
            System.out.println("Environment is TEST. Seeding data...");
            for (int i = 1; i <= 5; i++) {
                repository.save(new Book(null, "Book Title " + i, "Author " + i));
            }
        }
    }
}