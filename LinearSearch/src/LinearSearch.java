import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 50};

        // Number to search
        int target = 20;

        // perform linear serach
        int[] indices = findAllOccurrences(numbers, target);
        System.out.println("Find All Occurrences : ");
        if(indices.length > 0) {
            for(int index : indices) {
                System.out.print(index + " ");
            }
        }else {
            System.out.println("Number not found");
        }
        System.out.println();
    }

    public static int[] findAllOccurrences(int[] array, int target) {
        // Create an ArrayList to store the indices
        List<Integer> indicesList = new ArrayList<>();
        for(int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if(array[currentIndex] == target) {
                indicesList.add(currentIndex);
            }
        }
        // Convert the ArrayList to an array and return it
        return indicesList.stream()
                .mapToInt(i -> i)
                .toArray();
    }


}
