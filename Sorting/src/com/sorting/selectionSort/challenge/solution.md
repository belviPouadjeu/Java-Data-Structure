```java
import java.util.ArrayList;

public class Database {
    private ArrayList<Registration> registrations = new ArrayList<>();

    public Database() {
        // Initialize the list of registrations
        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        // ... (rest of the registrations remain the same)
    }

    public void printAll() {
        for (Registration reg : registrations) {
            System.out.println(reg);
        }
    }

    public void insertionSort() {
        int regCount = registrations.size();

        for (int unsortedIndx = 1; unsortedIndx < regCount; unsortedIndx++) {
            Registration unsortedReg = registrations.get(unsortedIndx);
            int sortedIndx = unsortedIndx - 1;

            while (sortedIndx >= 0) {
                Registration sortedReg = registrations.get(sortedIndx);

                if (sortedReg.license.compareTo(unsortedReg.license) > 0) {
                    registrations.set(sortedIndx + 1, sortedReg);
                    sortedIndx--;
                } else {
                    break;
                }
            }
            registrations.set(sortedIndx + 1, unsortedReg);
        }
    }

    public void bubbleSort() {
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

    public static void main(String[] args) {
        Database db = new Database();

        System.out.println("\n******* Unsorted List ******\n");
        db.printAll();

        /* TODO 8: Replace the invocation of the bubbleSort() method
                   with an invocation of the insertionSort()
         */
        db.insertionSort();

        System.out.println("\n******* Sorted List ******\n");
        db.printAll();
    }
}
```