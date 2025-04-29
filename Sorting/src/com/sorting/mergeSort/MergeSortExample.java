package com.sorting.mergeSort;

public class MergeSortExample {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Calculate the middle index
            int middle = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    // Method to merge two sorted subarrays
    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1; // Size of the left subarray
        int n2 = right - middle;    // Size of the right subarray

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {34, 45, 1, 12, 5, 89, 67};

        System.out.print("Original array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
