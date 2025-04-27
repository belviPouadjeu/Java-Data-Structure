//import java.util.ArrayList;
//import java.util.List;
//
//public class LinearSearch {
//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 20, 50};
//
//        // Number to search
//        int target = 0;
//
//        // perform linear serach
//        int[] indices = findAllOccurrences(numbers, target);
//        System.out.println("Find All Occurrences : ");
//        if(indices.length > 0) {
//            for(int index : indices) {
//                System.out.println(index + " ");
//            }
//        }else {
//            System.out.println("Number not found");
//        }
//        System.out.println();
//    }
//
//    public static int[] findAllOccurrences(int[] arr, int target) {
//        // Create an ArrayList to store the indices
//        List<Integer> indicesList = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                indicesList.add(i); // Add the index to the ArrayList
//            }
//        }
//        // Convert the ArrayList to an array and return it
//        return indicesList.stream()
//                .mapToInt(i -> i)
//                .toArray();
//    }
//
//
//}
