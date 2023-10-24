package com.example.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ms
 * @Date 2023-10-24 19:31
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // create an empty arraylist
        List<String> list = new ArrayList<>();

        // add elements to the list
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // print the list
        System.out.println("Original list: " + list);

        // insert an element at specific index
        list.add(1, "JavaScript");
        System.out.println("After insert an element: " + list);

        // get an element at specific index
        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // remove an element at specific index
        list.remove(1);
        System.out.println("After remove an element: " + list);

        // remove an element by value
        list.remove("Java");
        System.out.println("After remove an element by value: " + list);
    }
}
