package com.example.javase.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @Author ms
 * @Date 2023-10-22 21:41
 */
public class LinkedHashSetTest {

    public static void main(String[] args) {
        // 读入文本
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // 分割单词
        String[] words = text.split("\\s+");

        // 创建集合
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 统计每个单词出现的次数
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (!set.contains(words[i])) {
                set.add(words[i]);
            }
            count[i] = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }

        // 输出结果
        System.out.println("单词\t出现次数");
        for (String word : set) {
            int sum = 0;
            for (int i = 0; i < words.length; i++) {
                if (word.equals(words[i])) {
                    sum += count[i];
                }
            }
            System.out.println(word + "\t" + sum);
        }
    }
}
