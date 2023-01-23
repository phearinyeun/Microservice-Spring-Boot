package com.microservice.spring.Microservice.services;

import com.microservice.spring.Microservice.model.Book;
import com.microservice.spring.Microservice.repo.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBook(Long id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.createBook(book);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteBook(bookId);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        Book findBook = bookRepository.findBookById(id);
        if (!findBook.equals(id)){
            book.setId(id);
            return bookRepository.save(book);
        }
        return null;
    }
}
