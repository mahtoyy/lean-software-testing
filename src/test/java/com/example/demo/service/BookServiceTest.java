package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.impl.BookServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository repository;

    @InjectMocks
    private BookServiceImpl bookService;

    @Test
    @DisplayName("Should save a book successfully")
    void testSaveBook() {
        // Arrange
        Book book = new Book(null, "Test Book", "Author");
        when(repository.save(any(Book.class))).thenReturn(new Book(1L, "Test Book", "Author"));

        // Act
        Book savedBook = bookService.save(book);

        // Assert
        assertThat(savedBook).isNotNull();
        assertThat(savedBook.getId()).isEqualTo(1L);
        verify(repository, times(1)).save(book);
    }

    @Test
    @DisplayName("Should find book by ID")
    void testGetById() {
        // Arrange
        Book book = new Book(1L, "JUnit 5 Guide", "Tester");
        when(repository.findById(1L)).thenReturn(Optional.of(book));

        // Act
        Optional<Book> found = bookService.getById(1L);

        // Assert
        assertThat(found).isPresent();
        assertThat(found.get().getTitle()).isEqualTo("JUnit 5 Guide");
    }
}