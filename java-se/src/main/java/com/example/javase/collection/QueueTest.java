package com.example.javase.collection;

import java.util.concurrent.*;

/**
 * @Author ms
 * @Date 2023-10-24 23:32
 */
public class QueueTest {

    private static final int BUFFER_SIZE = 10;
    private static final int PRODUCER_COUNT = 5;
    private static final int CONSUMER_COUNT = 5;
    private static final int ITEM_COUNT = 1000;

    private static final ExecutorService pool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(BUFFER_SIZE);

        for (int i = 0; i < PRODUCER_COUNT; i++) {
            pool.execute(new Producer(queue, ITEM_COUNT));
        }

        for (int i = 0; i < CONSUMER_COUNT; i++) {
            pool.execute(new Consumer(queue, ITEM_COUNT));
        }

        TimeUnit.SECONDS.sleep(3);

        pool.shutdown();
    }

    static class Producer implements Runnable {
        final BlockingQueue<Integer> queue;
        final int count;

        Producer(BlockingQueue<Integer> queue, int count) {
            this.queue = queue;
            this.count = count;
        }

        public void run() {
            try {
                for (int i = 0; i < count; i++) {
                    queue.put(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        final BlockingQueue<Integer> queue;
        final int count;

        Consumer(BlockingQueue<Integer> queue, int count) {
            this.queue = queue;
            this.count = count;
        }

        public void run() {
            try {
                for (int i = 0; i < count; i++) {
                    queue.take();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
