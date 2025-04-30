```java
import java.util.ArrayList;
import java.util.List;

public class Database {
private ArrayList<Registration> registrations = new ArrayList<>();

    public Database() {
        // TODO: Initialize the database with default Registration entries
        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        registrations.add(new Registration("ANA-2866", "Zane Hallworth"));
        registrations.add(new Registration("DYC-5707", "Jodi Gatfield"));
        registrations.add(new Registration("GIG-1870", "Harvey Kenny"));
        registrations.add(new Registration("NWK-2057", "Janice Hudson"));
        registrations.add(new Registration("BYJ-6279", "Larry Newman"));
        registrations.add(new Registration("ENY-2915", "Helen Pryor"));
        registrations.add(new Registration("OYW-0632", "Quincy Cromwell"));
    }

    public void printAll() {
        // TODO: Print all registrations to console
        for (Registration reg : registrations) {
            System.out.println(reg);
        }
    }

    public void quickSort() {
        // TODO: Perform iterative quicksort on the registrations list
        int low = 0;
        int high = registrations.size() - 1;

        while (low < high) {
            int pivotIndex = partition(high, low);

            if (pivotIndex - 1 > low) {
                high = pivotIndex - 1;
            } else if (pivotIndex + 1 < high) {
                low = pivotIndex + 1;
            } else {
                break;
            }
        }
    }

    private int partition(int highIndx, int lowIndx) {
        // TODO: Partition the list between lowIndx and highIndx using the last element as pivot
        List<Registration> subArray = registrations.subList(lowIndx, highIndx + 1);
        Registration pivotElement = subArray.get(subArray.size() - 1);
        int greaterIndex = -1;

        for (int currentIndex = 0; currentIndex < subArray.size() - 1; currentIndex++) {
            Registration currentElement = subArray.get(currentIndex);

            // TODO: Compare license of currentElement to pivotElement
            if (currentElement.license.compareTo(pivotElement.license) <= 0) {
                greaterIndex++;
                if (greaterIndex < currentIndex) {
                    swap(subArray, greaterIndex, currentIndex);
                }
            }
        }

        // TODO: Move pivot element to correct position
        int pivotIndex = greaterIndex + 1;
        swap(subArray, pivotIndex, subArray.size() - 1);

        // TODO: Return actual index of pivot in main registrations list
        return pivotIndex + lowIndx;
    }

    private void swap(List<Registration> subArray, int i, int j) {
        // TODO: Swap two elements in the given sublist
        Registration iElement = subArray.get(i);
        Registration jElement = subArray.get(j);
        subArray.set(i, jElement);
        subArray.set(j, iElement);
    }

    public void bubbleSort() {
        // TODO: Implement bubble sort algorithm to sort registrations by license
        int n = registrations.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Registration currentReg = registrations.get(j);
                Registration nextReg = registrations.get(j + 1);
                if (currentReg.license.compareTo(nextReg.license) > 0) {
                    registrations.set(j, nextReg);
                    registrations.set(j + 1, currentReg);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void insertionSort() {
        // TODO: Implement insertion sort algorithm to sort registrations by license
        int regCount = registrations.size();
        for (int unsorted_Indx = 1; unsorted_Indx < regCount; unsorted_Indx++) {
            Registration unsortedReg = registrations.get(unsorted_Indx);
            int sorted_Indx = unsorted_Indx - 1;

            while (sorted_Indx >= 0) {
                Registration sortedReg = registrations.get(sorted_Indx);
                if (sortedReg.license.compareTo(unsortedReg.license) > 0) {
                    registrations.set(sorted_Indx + 1, sortedReg);
                    sorted_Indx--;
                } else {
                    break;
                }
            }
            registrations.set(sorted_Indx + 1, unsortedReg);
        }
    }

    public void mergeSort() {
        // TODO: Implement iterative merge sort algorithm to sort registrations by license
        int n = registrations.size();
        for (int subArrSize = 1; subArrSize < n; subArrSize *= 2) {
            for (int leftStart = 0; leftStart < n - subArrSize; leftStart += 2 * subArrSize) {
                int rightStart = leftStart + subArrSize;
                int rightEndExcluded = Math.min(leftStart + 2 * subArrSize, n);
                ArrayList<Registration> leftArray = new ArrayList<>(registrations.subList(leftStart, rightStart));
                ArrayList<Registration> rightArray = new ArrayList<>(registrations.subList(rightStart, rightEndExcluded));
                merge(leftStart, leftArray, rightArray);
            }
        }
    }

    private void merge(int mergeIndex, ArrayList<Registration> leftArray, ArrayList<Registration> rightArray) {
        // TODO: Merge two sorted lists (leftArray and rightArray) into main list
        int left_Indx = 0, right_Indx = 0;
        while (left_Indx < leftArray.size() && right_Indx < rightArray.size()) {
            Registration leftVal = leftArray.get(left_Indx);
            Registration rightVal = rightArray.get(right_Indx);
            if (leftVal.license.compareTo(rightVal.license) <= 0) {
                registrations.set(mergeIndex++, leftVal);
                left_Indx++;
            } else {
                registrations.set(mergeIndex++, rightVal);
                right_Indx++;
            }
        }
        while (left_Indx < leftArray.size()) {
            registrations.set(mergeIndex++, leftArray.get(left_Indx++));
        }
        while (right_Indx < rightArray.size()) {
            registrations.set(mergeIndex++, rightArray.get(right_Indx++));
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.quickSort(); // TODO: You can test different sort methods here
        System.out.println("\n******* Sorted ArrayList ******\n");
        db.printAll();  // TODO: Display the sorted list
    }
}

```
