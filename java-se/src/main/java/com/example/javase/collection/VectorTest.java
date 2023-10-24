package com.example.javase.collection;

import java.util.Vector;

/**
 * @Author ms
 * @Date 2023-10-20 20:21
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        vector.add("JavaScript");
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector contains Java? " + vector.contains("Java"));
        System.out.println("Vector contains Ruby? " + vector.contains("Ruby"));
        System.out.println("Vector at index 2: " + vector.get(2));
        vector.remove(1);
        System.out.println("Vector size after remove: " + vector.size());
        System.out.println("Vector at index 1 after remove: " + vector.get(1));
    }
}
