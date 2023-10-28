package com.example.javase.collection.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author ms
 * @Date 2023-10-24 13:31
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                try {
                    queue.put(i);
                    System.out.println("生产了：" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Integer num = queue.take();
                    System.out.println("消费了：" + num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
