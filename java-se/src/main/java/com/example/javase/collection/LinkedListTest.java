package com.example.javase.collection;

import java.util.LinkedList;

/**
 * @Author ms
 * @Date 2023-10-20 19:50
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);

        // Test the addFirst method
        list.addFirst(0);
        System.out.println(list);

        // Test the addLast method
        list.addLast(4);
        System.out.println(list);

        // Test the remove method
        list.remove();
        System.out.println(list);

        // Test the removeFirst method
        list.removeFirst();
        System.out.println(list);

        // Test the removeLast method
        list.removeLast();
        System.out.println(list);

        // Test the size method
        System.out.println("Size of the list: " + list.size());

        // Test the get method
        System.out.println("Element at index 1: " + list.get(1));
    }
}
