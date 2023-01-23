package com.microservice.spring.Microservice.controller;

import com.microservice.spring.Microservice.model.Book;
import com.microservice.spring.Microservice.services.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/{bookId}")
    public Book findBook(@PathVariable Long bookId){
        return bookService.findBook(bookId);
    }

    @PostMapping
    public Book createbook (@RequestBody Book book){
        return bookService.createBook(book);
    }
}
