/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarysystem;

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookID());
    }

    public void removeBook(int bookID) {
        books.removeIf(book -> book.getBookID() == bookID);
        System.out.println("Book removed: " + bookID);
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBook();
                System.out.println("-------------------");
            }
        }
    }
}
