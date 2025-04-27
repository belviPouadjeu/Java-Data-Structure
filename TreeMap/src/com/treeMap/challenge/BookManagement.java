package com.treeMap.challenge;

import java.util.TreeMap;

public class BookManagement {
    private TreeMap<String, String> books = new TreeMap<>();

    public void addOrUpdateBook(String isbn, String title) {
        // Add or update to the TreeMap
        if (books.containsKey(isbn)) {
            System.out.println("Updating book with ISBN " + isbn + " to new title: " + title);
        } else {
            System.out.println("Adding new book with ISBN " + isbn + " and title: " + title);
        }
        books.put(isbn, title);
    }

    public void removeBook(String isbn) {
        // Check and remove only if present in the TreeMap
        if (books.containsKey(isbn)) {
            books.remove(isbn);
            System.out.println("Book with ISBN " + isbn + " removed.");
        } else {
            System.out.println("Book with ISBN " + isbn + " not found. Unable to remove.");
        }
    }

    public String getBookTitle(String isbn) {
        // Get from TreeMap and print appropriate message if not found
        if (books.containsKey(isbn)) {
            String title = books.get(isbn);
            System.out.println("Book with ISBN " + isbn + ": " + title);
            return title;
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return null;
        }
    }

    public void displayAllBooks() {
        // Display all elements in the TreeMap
        if (books.isEmpty()) {
            System.out.println("\nNo books available in the collection.");
        } else {
            System.out.println("\n--- List of Books ---");
            for (String isbn : books.keySet()) {
                System.out.println("ISBN: " + isbn + " | Title: " + books.get(isbn));
            }
            System.out.println("---------------------");
        }
    }
}
