package com.example;
import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> books;

    public Bookshelf() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }
        books.add(book);
    }
}

