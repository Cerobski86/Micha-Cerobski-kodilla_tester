package com.kodilla;

public class BookTest {
    public static void main(String[] args) {
        Book book = Book.of("Potop", "Henryk Sienkiewicz");
        System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle());
    }
}
