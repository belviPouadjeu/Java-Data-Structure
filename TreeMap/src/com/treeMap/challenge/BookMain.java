package com.treeMap.challenge;

import java.util.TreeMap;

public class BookMain {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();

        // Add or update books
        bookManagement.addOrUpdateBook("978-0134685991", "Effective Java");
        bookManagement.addOrUpdateBook("978-1491950357", "Clean Architecture");
        bookManagement.addOrUpdateBook("978-0132350884", "Clean Code");

        // Display all books
        bookManagement.displayAllBooks();

        // Retrieve the title of a specific book by ISBN
        bookManagement.getBookTitle("978-0134685991");

        // Remove a book
        bookManagement.removeBook("978-1491950357");

        // Display all books after removal
        bookManagement.displayAllBooks();
    }
}
