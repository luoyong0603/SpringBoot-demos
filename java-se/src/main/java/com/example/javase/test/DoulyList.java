package com.example.javase.test;

/**
 * @Author bug菌
 * @Date 2023-10-14 19:07
 */
public class DoulyList {
    DoubleNode head;

    public DoulyList() {
        this.head = null;
    }

    // 插入节点到双链表的末尾
    public void insert(int data) {
        DoubleNode newNode = new DoubleNode(data);

        if (head == null) {
            head = newNode;
        } else {
            DoubleNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // 查询首个与pattern匹配的子表
    public DoubleNode search(DoubleNode pattern) {
        DoubleNode current = head;

        while (current != null) {
            if (current.data == pattern.data) {
                boolean isMatch = compareNode(current, pattern);
                if (isMatch) {
                    return current;
                }
            }
            current = current.next;
        }

        return null;
    }

    // 比较两个节点之后的子表是否匹配
    private boolean compareNode(DoubleNode node1, DoubleNode node2) {
        DoubleNode current1 = node1;
        DoubleNode current2 = node2;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return current2 == null;
    }

    // 打印双链表
    public void display() {
        DoubleNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DoulyList list = new DoulyList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.display();

        DoulyList pattern = new DoulyList();
        pattern.insert(4);
        pattern.insert(5);
        pattern.insert(6);

        DoubleNode matchNode = list.search(pattern.head);
        if (matchNode != null) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found!");
        }
    }
}
