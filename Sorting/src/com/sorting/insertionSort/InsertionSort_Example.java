package com.sorting.insertionSort;

public class InsertionSort_Example {
    public static void main(String[] args) {
        String[] names = {"Touko", "Mbarge", "Ngando", "Aboubakar", "Ekane", "Nguefang", "Biloa", "Fomunyam", "Saidou"};
        insertionSort(names);

        System.out.print("Sorted names : ");
        for (String name : names){
            System.out.print(name + " ");
        }
    }

    public static void insertionSort(String[] arr){
        int n = arr.length;
        for (int counter1 = 1; counter1 < n; counter1++){
            String key = arr[counter1];
            int counter2 = counter1 - 1;

            while (counter2 >= 0 && arr[counter2].compareToIgnoreCase(key) > 0){
                arr[counter2 + 1] = arr[counter2];
                counter2 = counter2 - 1;
            }

            arr[counter2 + 1] = key;
        }
    }
}
