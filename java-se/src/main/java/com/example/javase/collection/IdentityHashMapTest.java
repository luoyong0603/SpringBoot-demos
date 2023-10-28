package com.example.javase.collection;

import java.util.IdentityHashMap;

/**
 * @author ms
 * @date 2023/10/25 17:37
 */
public class IdentityHashMapTest {

    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<Integer, String>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map.get(1));  // 输出：One
        System.out.println(map.get(2));  // 输出：Two
        System.out.println(map.get(3));  // 输出：Three
        System.out.println(map.get(4));  // 输出：null

        map.put(1, "First");
        System.out.println(map.get(1));  // 输出：One

        map.remove(1);
        System.out.println(map.get(1));  // 输出：null

        map.clear();
        System.out.println(map.size());  // 输出：0
    }
}
