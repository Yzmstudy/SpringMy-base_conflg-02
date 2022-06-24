package com.yzm;

import com.yzm.service.BookService;
import com.yzm.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
