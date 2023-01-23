package com.microservice.spring.Microservice.repo;

import com.microservice.spring.Microservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT id from Book")
    Book findBookById(Long id);

    Book createBook(Book book);

    void deleteBook(Long bookId);
}
