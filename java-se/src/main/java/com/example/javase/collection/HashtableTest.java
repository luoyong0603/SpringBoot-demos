package com.example.javase.collection;

import java.util.Hashtable;

/**
 * @author ms
 * @date 2023/10/25 16:26
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();
        String text = "Hello world, hello Java. World is big, and Java is great!";

// Split the text into words
        String[] words = text.split("[^\\w']+");

// Count the number of occurrences of each word
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

// Print the result
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}
