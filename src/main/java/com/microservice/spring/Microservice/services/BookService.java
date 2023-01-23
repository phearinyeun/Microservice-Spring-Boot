package com.microservice.spring.Microservice.services;

import com.microservice.spring.Microservice.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book findBook(Long id);
    Book createBook(Book book);
    void deleteBook(Long bookId);
    Book updateBook(Long id, Book book);

}
