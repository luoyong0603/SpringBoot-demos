package com.example.javase.collection;

import java.util.PriorityQueue;

/**
 * @Author ms
 * @Date 2023-10-24 18:47
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        // 创建一个PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 添加元素
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);

        // 获取元素
        System.out.println(pq.poll()); // 1
        System.out.println(pq.poll()); // 2
        System.out.println(pq.poll()); // 3

        // 检查是否为空
        System.out.println(pq.isEmpty()); // true
    }
}
