package com.sorting.test;

public class StepSorter {
    public static void main(String[] args) {
        int[] steps = {7500, 9000, 8000, 10000, 8500};
        for (int counter1 = 0; counter1 < steps.length - 1; counter1++) {
            for (int counter2 = 0; counter2 < steps.length - 1; counter2++) {
                if (steps[counter2] < steps[counter2 + 1]) {
                    int temp = steps[counter1];
                    steps[counter2] = steps[counter2 + 1];
                    steps[counter2 + 1] = temp;
                }
            }
        }
        // Output steps array here
    }
}
