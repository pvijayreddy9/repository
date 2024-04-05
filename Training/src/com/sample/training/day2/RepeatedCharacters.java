package com.sample.training.day2;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            // Ignore spaces or any other characters you don't want to count
            if (c != ' ') {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Print the repeated characters along with their frequencies
        System.out.println("Repeated characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' is repeated " + entry.getValue() + " times.");
            }
        }
    }
}

