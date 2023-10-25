package com.example.javase.collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Author ms
 * @Date 2023-10-23 19:47
 */
public class TreeMapTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        // 添加键值对
        map.put("Alice", 90);
        map.put("Bob", 80);
        map.put("Charlie", 70);
        map.put("David", 80);
        map.put("Eve", 90);

        // 输出键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 输出包含指定前缀的键值对
        SortedMap<String, Integer> subMap = ((TreeMap<String, Integer>) map).subMap("B", "D");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 移除指定键值对
        map.remove("Charlie");

        // 输出移除后的键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
