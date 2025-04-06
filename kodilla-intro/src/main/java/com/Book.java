package com;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

//    private Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }

    public String getAuthor() {
        return author;
    }

    public static Book of(String title, String author) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        return book;
    }
}