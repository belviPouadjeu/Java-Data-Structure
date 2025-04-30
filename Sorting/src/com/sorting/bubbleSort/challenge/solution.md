````java
import java.util.ArrayList;

public class Database {
    private ArrayList<Registration> registrations = new ArrayList<>();

    public Database() {
        // Initialize the list of registrations
        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        registrations.add(new Registration("ANA-2866", "Zane Hallworth"));
        // ... (rest of the registrations remain the same)
    }

    public void printAll(){
        for (Registration reg : registrations) {
            System.out.println(reg);
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
                    // Swap the positions
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
        // TODO 1: Create an instance of the Database class
        Database database = new Database();

        System.out.println("\n******* Unsorted List ******\n");
        
        // TODO 2: Call the printAll() method on the Database instance
        database.printAll();

        System.out.println("\n******* Sorted List ******\n");
        
        // TODO 8: Call the bubbleSort() method on the Database instance
        database.bubbleSort();
        
        // TODO 9: call the printAll() method
        database.printAll();
    }
}
````