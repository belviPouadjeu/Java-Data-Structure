// Package declaration for organizing the code into a specific folder
package com.sorting.selectionSort;

public class SelectionSort_Example {
    public static void main(String[] args) {
        // Initialize an array with heights of books
        int[] heightOfBooks = {29, 10, 14, 37, 13};

        // Call the selectionSort method to sort the array
        selectionSort(heightOfBooks);

        // Print the sorted array in ascending order
        System.out.println("Sorted heightOfBooks in ascending order:");
        for(int number : heightOfBooks) {
            // Print each element in the sorted array
            System.out.println(number + " ");
        };
    }

    // Method to perform selection sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to move the boundary of the unsorted part of the array
        for (int counter1 = 0; counter1 < n - 1; counter1++) {
            // Assume the first element of the unsorted part is the minimum
            int minIndex = counter1;

            // Inner loop to find the actual minimum element in the unsorted part
            for (int counter2 = counter1 + 1; counter2 < n; counter2++) {
                // Update minIndex if a smaller element is found
                if (arr[counter2] < arr[minIndex]) {
                    minIndex = counter2;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex]; // Store the minimum element temporarily
            arr[minIndex] = arr[counter1]; // Replace the minimum element's position with the first element
            arr[counter1] = temp; // Assign the temporary value to its correct position
        }
    }
}
