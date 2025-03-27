/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarysystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class LibrarySystem {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(101, "BELOVED", "Toni Morrison");
        Book book2 = new Book(102, "THOMAS CALCULUS", "Thomas");
        Book book3 = new Book(103, "TREASURE ISLAND", "Robert Louis Stevenson");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\n--- Library Books ---");
        library.displayAllBooks();

        library.removeBook(102);

        System.out.println("\n--- Updated Library Books ---");
        library.displayAllBooks();
    }
}
