package com.example.legacy.di.basic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookStore {

    @Autowired
    @Qualifier(value = "book2")
    private Book book;

    public BookStore() {
    }

    public BookStore(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    @Autowired
    @Qualifier(value = "book3")
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore [book=" + book + "]";
    }
}
