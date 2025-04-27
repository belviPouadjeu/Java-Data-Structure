package com.bookManagement.challenge;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookManagement {
    private final LinkedHashMap<String, String> borrowedBooks = new LinkedHashMap<>();

    // TODO 1: Borrow a book
    public void borrowBook(String studentName, String bookTitle) {
        borrowedBooks.put(studentName, bookTitle);
        System.out.println(studentName + " borrowed " + bookTitle);
    }

    // TODO 2: Return a book
    public void returnBook(String studentName) {
        if (borrowedBooks.containsKey(studentName)) {
            borrowedBooks.remove(studentName);
            System.out.println(studentName + " returned their book.");
        } else {
            System.out.println(studentName + " has not borrowed any book.");
        }
    }

    // TODO 3: Check if a student has borrowed a book
    public void checkBorrowedBook(String studentName) {
        if (borrowedBooks.containsKey(studentName)) {
            String bookTitle = borrowedBooks.get(studentName);
            System.out.println(studentName + " has borrowed " + bookTitle);
        } else {
            System.out.println(studentName + " has not borrowed any books.");
        }
    }

    // TODO 4: Display all borrowed books
    public void displayAllBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books are currently borrowed.");
        } else {
            System.out.println("List of borrowed books:");
            for (Map.Entry<String, String> entry : borrowedBooks.entrySet()) {
                System.out.println(entry.getKey() + " borrowed " + entry.getValue());
            }
        }
    }

    // TODO 5: Borrow a book only if not already borrowed
    public void borrowBookIfNotBorrowed(String bookTitle, String studentName) {
        if (!borrowedBooks.containsValue(bookTitle)) {
            borrowedBooks.putIfAbsent(studentName, bookTitle);
            System.out.println(studentName + " successfully borrowed " + bookTitle);
        } else {
            System.out.println(bookTitle + " is already borrowed by another student.");
        }
    }

    public static void main(String[] args) {
        BookManagement library = new BookManagement();

        // Borrowing books
        library.borrowBook("Alice", "Harry Potter");
        library.borrowBook("Bob", "The Hobbit");
        library.borrowBook("Charlie", "1984");

        // Display all borrowed books
        library.displayAllBorrowedBooks();

        // Check if a student has borrowed a book
        library.checkBorrowedBook("Alice");
        library.checkBorrowedBook("Diana");

        // Borrow a book only if not already borrowed
        library.borrowBookIfNotBorrowed("Harry Potter", "Eve");
        library.borrowBookIfNotBorrowed("To Kill a Mockingbird", "Eve");

        // Return a book
        library.returnBook("Bob");
        library.returnBook("Diana");

        // Display all borrowed books after returning
        library.displayAllBorrowedBooks();
    }
}
