import java.util.TreeMap;

public class TreeMap_Example {
    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("Barga", "Bafoussam");
        treeMap.put("Ngomba", "Douala");
        treeMap.put("Tabi", "Yaoundé");
        treeMap.put("Mefire", "Bamenda");
        treeMap.put("Nfor", "Limbe");
        treeMap.put("Ateba", "Garoua");
        treeMap.put("Njie", "Buea");
        treeMap.put("Tanjong", "Ngaoundéré");

        // Displaying the student entries
        for (String student : treeMap.keySet()) {
            System.out.println("Student : " + student + " | Town : " + treeMap.get(student));

        }

        System.out.println("Displaying with numbering");

        // Displaying with numbering
        int count = 1;
        for (String student : treeMap.keySet()) {
            System.out.println(count + " - Student: " + student + " | Town: " + treeMap.get(student));
            count++;
        }

    }
}