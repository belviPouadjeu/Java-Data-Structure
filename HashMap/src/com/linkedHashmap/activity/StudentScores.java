package com.linkedHashmap.activity;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentScores {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();
        // Adding initial scores
        studentScores.put("James", 85);
        studentScores.put("Tchoffo", 90);
        studentScores.put("Ose", 75);
        studentScores.put("Peter", 34);

        // Displaying all scores
        System.out.println("initial score : ");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Updating Ose's score
        studentScores.put("Ose", 98);

        // Check if James is in the list
        if(studentScores.containsKey("James")){
            System.out.println("James's score : " + studentScores.get("James"));
        }

        // Removing James from the list
        studentScores.remove("James");

        // Adding new student if not already present
        studentScores.putIfAbsent("Ali", 83);

        //  Displaying the final scores
        System.out.println("\nFinal scores : ");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
