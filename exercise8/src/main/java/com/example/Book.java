package com.example;
import java.util.Arrays;

public class Book {
    private String title;
    private int publishedYear;
    private int numberOfPages;
    private String[] authors;

    public Book() {
    }

    public Book(String title, int publishedYear, int numberOfPages, String[] authors) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                ", numberOfPages=" + numberOfPages +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
