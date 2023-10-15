package com.example.javase.test;

/**
 * @Author bug菌
 * @Date 2023-10-14 19:06
 */
public class DoubleNode {
    int data;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
