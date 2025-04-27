package com.linkedHashmap.activity;

import java.util.LinkedHashMap;

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

    }
}
