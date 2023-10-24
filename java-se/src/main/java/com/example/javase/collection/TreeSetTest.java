package com.example.javase.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author ms
 * @Date 2023-10-24 21:23
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // 添加元素
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("pear");
        set.add("grape");
        set.add("watermelon");

        // 输出元素
        System.out.println("TreeSet中的元素为：");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 删除元素
        set.remove("orange");

        // 输出元素
        System.out.println("删除元素后，TreeSet中的元素为：");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
