package com.sorting.insertionSort;

public class InsertionDescendingOrder {
    public static void main(String[] args) {
        String[] names = {"Touko", "Mbarge", "Ngando", "Aboubakar", "Ekane", "Nguefang", "Biloa", "Fomunyam", "Saidou"};

        insertionSortDescending(names);

        System.out.print("Sorted names in reverse order: ");
        for (String name : names) {
            System.out.print(name + " - ");
        }
    }

    public static void insertionSortDescending(String[] arr) {
        int n = arr.length;
        for(int counter1 = 1; counter1 < n; counter1++){
            String key = arr[counter1];
            int counter2 = counter1 - 1;

            // Changed condition to sort in descending order
            while(counter2 >= 0 && arr[counter2].compareTo(key) < 0){
                arr[counter2 + 1] = arr[counter2];  // Shift elements to the right
                counter2--;
            }

            arr[counter2 + 1] = key;
        }
    }
}
