package com.example.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ms
 * @Date 2023-10-23 18:47
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 添加元素
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);

        // 获取元素
        System.out.println(map.get("Java"));
        System.out.println(map.get("C#"));

        // 移除元素
        map.remove("C++");

        // 获取元素个数
        System.out.println(map.size());

        // 清空Map
        map.clear();
        System.out.println(map.size());
    }
}
