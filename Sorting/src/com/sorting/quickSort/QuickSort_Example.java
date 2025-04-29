package com.sorting.quickSort;

public class QuickSort_Example {

    // Partition method to rearrange elements based on the pivot
    public static int partition(int[] array, int low, int high) {
        // Select the last element of the array as the pivot
        int pivot = array[high]; // Pivot is the element to be placed in the correct position
        int i = low - 1; // Index of the smaller element (elements less than the pivot)

        // Loop through the array from the low index to the high index - 1
        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (array[j] < pivot) {
                i++; // Increment the index of the smaller element

                // Swap the smaller element with the element at index i
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition index (final position of the pivot)
        return i + 1;
    }

    // QuickSort method to recursively sort the array
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) { // Continue sorting if there are at least two elements in the current partition
            // Find the partition index for the pivot
            int pi = partition(array, low, high);

            // Recursively sort the elements before the pivot
            quickSort(array, low, pi - 1);

            // Recursively sort the elements after the pivot
            quickSort(array, pi + 1, high);
        }
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        // Define an array of integers to be sorted
        int[] array = new int[] {300, 150, 400, 200, 500, 100, 450, 250};

        // Call the quickSort method to sort the array
        quickSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
