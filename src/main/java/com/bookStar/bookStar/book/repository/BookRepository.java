package com.bookStar.bookStar.book.repository;

import com.bookStar.bookStar.book.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<BookModel, Long> {
}
