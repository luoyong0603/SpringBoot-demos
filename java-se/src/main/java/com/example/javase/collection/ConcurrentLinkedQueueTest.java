package com.example.javase.collection;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author ms
 * @Date 2023-10-22 18:57
 */
public class ConcurrentLinkedQueueTest {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // 添加元素
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");

        // 输出队列元素
        System.out.println("Queue elements: " + queue);

        // 获取并移除队列头部元素
        String headElement = queue.poll();
        System.out.println("Head element: " + headElement);

        // 输出队列元素
        System.out.println("Queue elements after polling: " + queue);

        // 获取队列头部元素
        String peekElement = queue.peek();
        System.out.println("Peek element: " + peekElement);

        // 输出队列元素
        System.out.println("Queue elements after peeking: " + queue);
    }
}
