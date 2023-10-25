package com.example.javase.collection;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author ms
 * @date 2023/10/25 16:26
 */
public class WeakHashMapTest {

    public static void main(String[] args) {
        Map<Number, String> map = new WeakHashMap<>();
        Integer key1 = new Integer(1);
        Float key2 = new Float(2.0f);
        Double key3 = new Double(3.0);
        map.put(key1, "value1");
        map.put(key2, "value2");
        map.put(key3, "value3");
        System.out.println("Before GC: " + map);
        key1 = null;
        key2 = null;
        key3 = null;
        System.gc();
        System.out.println("After GC: " + map);
    }
}
