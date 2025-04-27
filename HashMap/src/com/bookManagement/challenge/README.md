# 📚 Library Management System - Assignment

You are building a **Library Management System** where you need to manage the borrowing and returning of books by students.  
The system will use a **LinkedHashMap** to keep track of the books each student has borrowed.

The **LinkedHashMap** will store:
- the student's name as the **key**
- the title of the borrowed book as the **value**.

---

## Requirements

You need to implement several features using the following methods of **LinkedHashMap**:  
`put()`, `get()`, `remove()`, `containsKey()`, `entrySet()`, and `putIfAbsent()`.

---

## TODOs

### ✅ TODO 1 - Borrow a Book

- When a student borrows a book, add their name and the book title to the `LinkedHashMap` using the `put()` method.
- If the student has already borrowed a book, update the existing entry with the new book title.

---

### ✅ TODO 2 - Return a Book

- Implement a method to remove the entry for a student when they return a book using the `remove()` method.
- If the student’s name is not found in the `LinkedHashMap`, display a message indicating that they haven’t borrowed any book.

---

### ✅ TODO 3 - Check if a Student has Borrowed a Book

- Implement a method to check if a student has borrowed a book using the `containsKey()` method.
- If the student has borrowed a book, return its title using the `get()` method.

---

### ✅ TODO 4 - Display All Borrowed Books

- Implement a method to display all students and their borrowed books using the `entrySet()` method.
- The order should be preserved as per the **insertion order**.

---

### ✅ TODO 5 - Borrow a Book Only If Not Already Borrowed

- Implement a feature where a book can only be borrowed by a student if it is **not already borrowed** by someone else.
- Use the `containsValue()` method to check if the book is already borrowed.
- If the book is already borrowed, the system should notify the student that the book is unavailable.

---
