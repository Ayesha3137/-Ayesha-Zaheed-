/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author Ayesha Zaheed
 */
public class Book {
    public static void printBookDetails(String bookName) {
        System.out.println("Book Name: " + bookName);
    }
    public static void printBookDetails(String bookName, int yearOfPublication) {
        System.out.println("Book Name: " + bookName);
        System.out.println("Year of Publication: " + yearOfPublication);
    }
    public static void printBookDetails(String bookName, int yearOfPublication, double price) {
        System.out.println("Book Name: " + bookName);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Price: $" + price);
    }
public static void main(String[] args) {
        System.out.println("--- Book with name only ---");
        printBookDetails("The Great Gatsby");

        System.out.println("\n--- Book with name and year ---");
        printBookDetails("To Kill a Mockingbird", 1960);

        System.out.println("\n--- Book with name, year, and price ---");
        printBookDetails("1984", 1949, 12.99);
    }
}