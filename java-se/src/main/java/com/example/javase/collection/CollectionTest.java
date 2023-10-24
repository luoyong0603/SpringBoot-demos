package com.example.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author ms
 * @Date 2023-10-23 20:55
 */
public class CollectionTest {

        public static void main(String[] args) {
            Collection<String> c1 = new ArrayList<String>();
            Collection<String> c2 = new ArrayList<String>();
            String[] s1 = {"a", "b", "c", "d", "e"};
            String[] s2 = {"c", "d", "e", "f", "g"};

            // 添加元素
            for (String s : s1) {
                c1.add(s);
            }
            System.out.println("c1: " + c1);   // c1: [a, b, c, d, e]

            // 删除元素
            c1.remove("b");
                    System.out.println("c1: " + c1);   // c1: [a, c, d, e]

            // 判断是否包含元素
            boolean contains = c1.contains("a");
            System.out.println("c1包含a元素吗？ " + contains);   // c1包含a元素吗？ true

            // 添加一组元素
            for (String s : s2) {
                c2.add(s);
            }
            System.out.println("c2: " + c2);   // c2: [c, d, e, f, g]

            // 求并集
            Collection<String> union = new ArrayList<String>(c1);
            union.addAll(c2);
            System.out.println("c1和c2的并集为：" + union);   // c1和c2的并集为：[a, c, d, e, f, g]

            // 求交集
            Collection<String> intersection = new ArrayList<String>(c1);
            intersection.retainAll(c2);
            System.out.println("c1和c2的交集为：" + intersection);   // c1和c2的交集为：[c, d, e]

            // 求差集
            Collection<String> difference = new ArrayList<String>(c1);
            difference.removeAll(c2);
            System.out.println("c1和c2的差集为：" + difference);   // c1和c2的差集为：[a]

            // 判断集合是否为空
            boolean empty = c1.isEmpty();
            System.out.println("c1是否为空？ " + empty);   // c1是否为空？ false

            // 获取集合中元素的个数
            int size = c1.size();
            System.out.println("c1中元素的个数为：" + size);   // c1中元素的个数为：4

            // 清空集合中的元素
            c1.clear();
            System.out.println("c1清空后为：" + c1);   // c1清空后为：[]
    }
}
