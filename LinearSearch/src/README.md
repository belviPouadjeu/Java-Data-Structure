## Linear Search for All Occurrences of a Target Value in an Integer Array

### Problem Description

Suppose you have an integer array with one duplicate element. You are searching for that element and will implement a linear search algorithm to find **all indices** of a specific value in the array.

#### Given:
- `arr`: an array of integers `[10, 20, 30, 20, 50]`
- `target`: the value `20` that appears multiple times in the array.

### Requirements

Complete these steps in the interactive code block:

#### 1. Implement the `findAllOccurrences` method:
- Complete the `findAllOccurrences` method to search through the array and collect all indices where the target value appears.
- Use an `ArrayList` to gather the indices and convert it to an array before returning.

#### 2. Testing:
- Test your implementation using different arrays and target values to ensure it correctly identifies all indices where the target value is found.
- Verify edge cases, such as:
    - An **empty array**.
    - A **target value not present** in the array.

### Sample Code Implementation

```java
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50};
        int target = 20;
        
        // Call the method and print the results
        int[] result = findAllOccurrences(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findAllOccurrences(int[] arr, int target) {
        // Create an ArrayList to store the indices
        ArrayList<Integer> indices = new ArrayList<>();

        // Loop through the array to find all occurrences of the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i); // Add the index to the ArrayList
            }
        }

        // Convert the ArrayList to an array and return it
        return indices.stream().mapToInt(i -> i).toArray();
    }
}
