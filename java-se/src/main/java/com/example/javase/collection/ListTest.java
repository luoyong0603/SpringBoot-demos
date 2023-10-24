package com.example.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ms
 * @Date 2023-10-24 18:47
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.remove("B");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(0, "D");
        System.out.println(list);
        System.out.println(list.size());
    }
}
