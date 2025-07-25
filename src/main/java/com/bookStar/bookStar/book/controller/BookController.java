package com.bookStar.bookStar.book.controller;

import com.bookStar.bookStar.book.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

}
