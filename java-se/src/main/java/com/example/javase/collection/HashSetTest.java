package com.example.javase.collection;

import java.util.HashSet;

/**
 * @Author ms
 * @Date 2023-10-21 21:05
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("Hello"));
        System.out.println(set.add("World"));
        System.out.println(set.add("Hello"));
        System.out.println(set.remove("Hello"));
        System.out.println(set.remove("Hello"));
        System.out.println(set.contains("Hello"));
        System.out.println(set.contains("World"));
        set.clear();
        System.out.println(set.size());
        set.add("Hello");
        set.add("World");
        System.out.println(set.size());
        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
