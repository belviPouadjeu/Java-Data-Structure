```java
import java.util.ArrayList;

public class Database {
private ArrayList registrations = new ArrayList();

    public Database() {
        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        registrations.add(new Registration("ANA-2866", "Zane Hallworth"));
        registrations.add(new Registration("DYC-5707", "Jodi Gatfield"));
        registrations.add(new Registration("GIG-1870", "Harvey Kenny"));
        registrations.add(new Registration("NWK-2057", "Janice Hudson"));
        registrations.add(new Registration("BYJ-6279", "Larry Newman"));
        registrations.add(new Registration("ENY-2915", "Helen Pryor"));
        registrations.add(new Registration("OYW-0632", "Quincy Cromwell"));
        registrations.add(new Registration("KEC-3996", "Kathy Myers"));
        registrations.add(new Registration("HOZ-1224", "Hugh Haines"));
        registrations.add(new Registration("KGJ-5010", "Tammy Mallard"));
        registrations.add(new Registration("FVA-4467", "Michael Knowles"));
        registrations.add(new Registration("NEV-9119", "Michael Knowles"));
        registrations.add(new Registration("BJT-9772", "Karl Yardley"));
        registrations.add(new Registration("YQD-3410", "Andrea Elsworth"));
        registrations.add(new Registration("DUY-0288", "Jay Zagorski"));
        registrations.add(new Registration("ATZ-9783", "Sally Oakes"));
        registrations.add(new Registration("IAG-6602", "Patrick Hewitt"));
        registrations.add(new Registration("DCP-2974", "Donna Wardman"));
        registrations.add(new Registration("FAH-2515", "Jay Newton"));
        registrations.add(new Registration("GYF-3958", "Carla Collins"));
        registrations.add(new Registration("NCL-9068", "James McBride"));
        registrations.add(new Registration("UBJ-1923", "Helen Gibbs"));
        registrations.add(new Registration("UUG-4837", "Conrad Pryor"));
        registrations.add(new Registration("GMD-6786", "Tracy Gilbert"));
        registrations.add(new Registration("QTW-6473", "Donald Gatfield"));
        registrations.add(new Registration("QQE-3264", "Charlotte Newport"));
        registrations.add(new Registration("WAO-8258", "Rodney Gilbert"));
    }

    public void printAll() {
        for (Object obj : registrations) {
            Registration reg = (Registration) obj;
            System.out.println(reg);
        }
    }

    public void mergeSort() {
        int n = registrations.size();

        // TODO 1-4: Set subarray size and loop
        for (int size = 1; size < n; size = 2 * size) {
            // TODO 5-7: Loop to process subarrays
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * size) {
                // TODO 8: Determine indexes
                int rightStart = Math.min(leftStart + size, n);
                int rightEndExcluded = Math.min(leftStart + 2 * size, n);

                // TODO 9: Create left and right subarrays
                ArrayList leftArray = new ArrayList(registrations.subList(leftStart, rightStart));
                ArrayList rightArray = new ArrayList(registrations.subList(rightStart, rightEndExcluded));

                // TODO 11: Comment out debug print
                // System.out.println("Left: " + leftStart + ", Right: " + rightStart +
                //        ", Right Excluded: " + rightEndExcluded);

                // TODO 12: Call merge
                merge(leftStart, leftArray, rightArray);
            }
        }
    }

    private void merge(int mergeIndex, ArrayList leftArray, ArrayList rightArray) {
        // TODO 13: Initialize indexes
        int leftIndx = 0;
        int rightIndx = 0;

        // TODO 14-15: Loop to merge elements from both subarrays
        while (leftIndx < leftArray.size() && rightIndx < rightArray.size()) {
            Registration leftVal = (Registration) leftArray.get(leftIndx);
            Registration rightVal = (Registration) rightArray.get(rightIndx);

            // TODO 17: Uncomment for debug
            // System.out.println("leftVal: " + leftVal.license + " rightVal: " + rightVal.license);
            // leftIndx++;

            // TODO 19: Compare and merge
            if (leftVal.license.compareTo(rightVal.license) <= 0) {
                registrations.set(mergeIndex, leftVal);  // TODO 20
                leftIndx++;
            } else {
                registrations.set(mergeIndex, rightVal);  // TODO 21
                rightIndx++;
            }
            mergeIndex++;  // TODO 22
        }

        // TODO 23-26: Merge remaining left elements
        while (leftIndx < leftArray.size()) {
            Registration leftVal = (Registration) leftArray.get(leftIndx); // TODO 24
            registrations.set(mergeIndex, leftVal);                         // TODO 25
            leftIndx++;                                                    // TODO 26
            mergeIndex++;
        }

        // TODO 27-30: Merge remaining right elements
        while (rightIndx < rightArray.size()) {
            Registration rightVal = (Registration) rightArray.get(rightIndx); // TODO 28
            registrations.set(mergeIndex, rightVal);                          // TODO 29
            rightIndx++;                                                     // TODO 30
            mergeIndex++;
        }
    }

    public void insertionSort() {
        int regCount = registrations.size();
        for (int unsortedIndx = 1; unsortedIndx < regCount; unsortedIndx++) {
            Registration unsortedReg =
                    (Registration) registrations.get(unsortedIndx);
            int sortedIndx = unsortedIndx - 1;
            while (sortedIndx >= 0) {
                Registration sortedReg =
                        (Registration) registrations.get(sortedIndx);
                int compareValue = sortedReg.license.compareTo(unsortedReg.license);
                if (sortedReg.license.compareTo(unsortedReg.license) > 0) {
                    registrations.set(sortedIndx + 1, sortedReg);
                    sortedIndx--; // Move to the next element to the left
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
                Registration currentReg = (Registration) registrations.get(j);
                Registration nextReg = (Registration) registrations.get(j + 1);
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
        db.mergeSort();

        // TODO 31: Uncomment the following lines
        System.out.println("\n******* Sorted ArrayList ******\n");
        db.printAll();
    }
}

```
