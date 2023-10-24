package com.example.javase.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ms
 * @Date 2023-10-21 20:51
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // 重复元素不会被添加

        System.out.println("Set size: " + set.size());
        for (String element : set) {
            System.out.println(element);
        }
    }
}
