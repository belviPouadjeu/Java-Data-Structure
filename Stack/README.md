# Text Editor Undo Mechanism - Stack Implementation

## Assignment Description

Implement a stack-based undo mechanism for a text editor using Java. The stack will store edit actions and provide functionality to manage these actions.

## Requirements

### 1. `TextEditorUndo` Class Implementation

Complete the following class by implementing all TODOs:

```java
package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array with given size
        // TODO 2: initialize top index to -1 (empty stack)
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: check if the stack is full
        // TODO 4: print message if the stack is full
        // TODO 5: increment top and add action to the stack
        // TODO 6: print confirmation message
    }

    // Method to remove and return the most recent action
    public String pop() {
        // TODO 7: check if the stack is empty
        // TODO 8: print message if empty and return null
        // TODO 9: retrieve and remove the top action
        // TODO 10: print confirmation and return the action
        return "";
    }

    // Method to view the most recent action without removing it
    public String peek() {
        // TODO 11: check if the stack is empty
        // TODO 12: print message if empty and return null
        // TODO 13: return the top action without removing it
        return "";
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: check if the stack is empty
        // TODO 15: print message if empty
        // TODO 16: iterate through stack and print actions
        // (most recent first)
        // TODO 17: print a new line after displaying
    }
}
```

## Main program file
```java
package com.lesson.lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TextEditorUndo undoStack = new TextEditorUndo(10); // Maximum 10 actions
        while (true) {
            System.out.println("\nText Editor Undo Mechanism");
            System.out.println("1. Add Edit Action");
            System.out.println("2. Undo Last Edit");
            System.out.println("3. View Last Edit");
            System.out.println("4. Display All Actions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = keyboard.nextInt();
                keyboard.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.nextLine(); // Clear invalid input
                continue; // Skip the rest of the loop iteration
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter edit action: ");
                    String action = keyboard.nextLine();
                    undoStack.push(action);
                    break;
                case 2:
                    undoStack.pop();
                    break;
                case 3:
                    String lastAction = undoStack.peek();
                    if (lastAction != null) {
                        System.out.println("Last edit action: \"" + lastAction + "\"");
                    }
                    break;
                case 4:
                    undoStack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
```