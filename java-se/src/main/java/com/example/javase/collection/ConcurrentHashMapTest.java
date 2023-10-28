package com.example.javase.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ms
 * @date 2023/10/25 18:08
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        // put方法测试
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));

        // remove方法测试
        map.remove("key1");
        System.out.println(map.get("key1"));

        // keySet方法测试
        System.out.println(map.keySet());

        // values方法测试
        System.out.println(map.values());
    }
}
