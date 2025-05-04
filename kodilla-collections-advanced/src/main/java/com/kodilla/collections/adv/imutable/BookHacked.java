package com.kodilla.collections.adv.imutable;

public class BookHacked extends Book {
    public BookHacked(String title, String author) {
        super(title, author);
    }

    public void modifyTitle(String newTitle) {
        title = newTitle;
    }
}