package com.example.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ms
 * @Date 2023-10-22 19:47
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // test put() and get()
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map.get("a")); // output: 1
        System.out.println(map.get("b")); // output: 2
        System.out.println(map.get("c")); // output: 3

        // test replace()
        map.put("a", 4);
        System.out.println(map.get("a")); // output: 4

        // test remove()
        map.remove("a");
        System.out.println(map.get("a")); // output: null

        // test clear()
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.clear();
        System.out.println(map.size()); // output: 0

        // test contains()
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map.containsKey("a")); // output: true
        System.out.println(map.containsValue(2)); // output: true
        System.out.println(map.containsKey("d")); // output: false
        System.out.println(map.containsValue(4)); // output: false
    }

}
