package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: Initialize the stack array
        stack = new String[size];
        // TODO 2: Initialize top index to -1
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: Check if the stack is full
        if (top == stack.length - 1) {
            // TODO 4: Print message if the stack is full
            System.out.println("Stack is full! Can't add element to the stack.");
        } else {
            // TODO 5: Increment top and add action to the stack
            stack[++top] = action;
            // TODO 6: Print confirmation message
            System.out.println(action + " added to stack.");
        }
    }

    // Method to remove and return the most recent action from the stack
    public String pop() {
        // TODO 7: Check if the stack is empty
        if (top == -1) {
            // TODO 8: Print message if the stack is empty and return null
            System.out.println("Stack is empty! Nothing to undo.");
            return null;
        } else {
            // TODO 9: Retrieve and remove the top action from the stack
            String poppedValue = stack[top--];
            // TODO 10: Print confirmation message and return the undone action
            System.out.println(poppedValue + " undone.");
            return poppedValue;
        }
    }

    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        if (top == -1) {
            // TODO 12: Print message if the stack is empty and return null
            System.out.println("Stack is empty! No action to view.");
            return null;
        } else {
            // TODO 13: Return the most recent action without removing it
            System.out.println("Top action: " + stack[top]);
            return stack[top];
        }
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty
        if (top == -1) {
            // TODO 15: Print message if the stack is empty
            System.out.println("Stack is empty! No actions to display.");
        } else {
            // TODO 16: Iterate through the stack and print each action
            System.out.println("Actions in stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
            // TODO 17: Print a new line after displaying all actions
            System.out.println();
        }
    }
}
