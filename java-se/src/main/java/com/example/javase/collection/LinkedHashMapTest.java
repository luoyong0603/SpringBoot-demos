package com.example.javase.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ms
 * @date 2023/10/25 15:50
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {

        // 创建一个 LinkedHashMap 对象
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        // 添加键值对到 LinkedHashMap
        linkedHashMap.put("key1", "value1");
        linkedHashMap.put("key2", "value2");
        linkedHashMap.put("key3", "value3");

        // 打印 LinkedHashMap 的键值对
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
