package com.example.legacy.di.basic2;

import org.springframework.stereotype.Component;

@Component
public class BookStore {

    private Book book;

    public BookStore() {
    }

    public BookStore(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore [book=" + book + "]";
    }
}
