package com.sorting.bubbleSort;

public class BubbleSort_Example {
    public static void main(String[] args) {
        int[] ages = {21, 18, 25, 19, 22};
        bubbleSort(ages);

        System.out.print("sorted ages : ");
        for (int age : ages){
            System.out.print(age + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int count1 = 0; count1 < n - 1; count1++){
            for (int count2 = 0; count2 < n - 1 - count1; count2++){
                if(arr[count2] > arr[count2 + 1]){
                    int temp = arr[count2];
                    arr[count2] = arr[count2 + 1];
                    arr[count2 + 1] = temp;
                }
            }
        }
    }
}
